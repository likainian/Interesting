package com.interesting.administrator.interesting.fragment;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.interesting.administrator.interesting.ContentActivity;
import com.interesting.administrator.interesting.OkHttpUtils;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.bean.HomeBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeListFragment extends Fragment {
    public RecyclerView mRecycleView;
    public SwipeRefreshLayout mSwipeRefresh;
    private int pager;
    private Context context;
    private LinearLayoutManager manager;
    private MyAdapter adapter;
    private ArrayList<HomeBean.WDataBean.DataBean> list = new ArrayList<>();

    public HomeListFragment() {
        // Required empty public constructor
    }

    public static HomeListFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString("url", url);
        HomeListFragment fragment = new HomeListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mRecycleView = (RecyclerView) view.findViewById(R.id.recycle_view);
        this.mSwipeRefresh = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
        initData();
        initAdapter();
        initListener();
    }

    private void initListener() {
        mSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                list.clear();
                pager = 1;
                initData();
                adapter.notifyDataSetChanged();
                mSwipeRefresh.setRefreshing(false);
            }
        });

        mRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            public int lastVisitable;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                mSwipeRefresh.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisitable + 1 == adapter.getItemCount()) {
                    pager++;
                    initData();
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                lastVisitable = manager.findLastVisibleItemPosition();
            }
        });
    }

    private void initAdapter() {
        manager = new LinearLayoutManager(context);
        mRecycleView.setLayoutManager(manager);
        adapter = new MyAdapter();
        mRecycleView.setAdapter(adapter);
    }

    private void initData() {
        OkHttpUtils.newInstance().get(getActivity(), HomeBean.class, getArguments().getString("url"),
                new OkHttpUtils.TextCallBack<HomeBean>() {

                    @Override
                    public void getText(HomeBean homeBean) {
                        list.addAll(homeBean.getData().getData());
                        adapter.notifyDataSetChanged();
                    }
                });

    }

    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @Override
        public int getItemViewType(int position) {
            if (list.get(position).getCover_show_type() != null) {
                return Integer.parseInt(list.get(position).getCover_show_type());
            }
            return 1;
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RecyclerView.ViewHolder holder = null;
            if (viewType == 1) {
                holder = new MyHolder1(LayoutInflater.from(context).inflate(R.layout.item_one, null));
            } else {
                holder = new MyHolder3(LayoutInflater.from(context).inflate(R.layout.item_three, null));
            }
            return holder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
            if (getItemViewType(position) == 1) {
                MyHolder1 holder1 = (MyHolder1) holder;
                holder1.rootView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ContentActivity.class);
                        intent.putExtra("url",list.get(position).getUrl());
                        startActivity(intent);
                    }
                });
                if (list.get(position).getTips().equals("")) {
                    Glide.with(context).load(list.get(position).getCover().get(0)).into(holder1.ivItem);
                    holder1.tvTitle.setText(list.get(position).getTitle());
                    holder1.tvComment.setText(list.get(position).getComment_count());
                    SimpleDateFormat format = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
                    Date date = new Date(Long.parseLong(list.get(position).getPublish_time()));
                    holder1.tvTime.setText(format.format(date));

                } else {
                    holder1.tvComment.setText(list.get(position).getTips());
                }

            } else if (getItemViewType(position) == 3) {
                MyHolder3 holder3 = (MyHolder3) holder;
                holder3.rootView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ContentActivity.class);
                        intent.putExtra("url",list.get(position).getUrl());
                        startActivity(intent);
                    }
                });
                if (list.get(position).getTips().equals("")) {
                    Glide.with(context).load(list.get(position).getCover().get(0)).into(holder3.ivItem);
                    Glide.with(context).load(list.get(position).getCover().get(1)).into(holder3.ivItem1);
                    Glide.with(context).load(list.get(position).getCover().get(2)).into(holder3.ivItem2);
                    holder3.tvTitle.setText(list.get(position).getTitle());
                    holder3.tvComment.setText(list.get(position).getComment_count());
                    SimpleDateFormat format = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
                    Date date = new Date(Long.parseLong(list.get(position).getPublish_time()));
                    holder3.tvTime.setText(format.format(date));
                }
            }
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyHolder1 extends RecyclerView.ViewHolder {
            public View rootView;
            public ImageView ivItem;
            public TextView tvTitle;
            public ImageView ivMessage;
            public TextView tvComment;
            public TextView tvTime;

            public MyHolder1(View itemView) {
                super(itemView);
                this.rootView = itemView;
                this.ivItem = (ImageView) rootView.findViewById(R.id.iv_item);
                this.tvTitle = (TextView) rootView.findViewById(R.id.tv_title);
                this.ivMessage = (ImageView) rootView.findViewById(R.id.iv_message);
                this.tvComment = (TextView) rootView.findViewById(R.id.tv_comment);
                this.tvTime = (TextView) rootView.findViewById(R.id.tv_time);
            }
        }

        public class MyHolder3 extends RecyclerView.ViewHolder {
            public View rootView;
            public TextView tvTitle;
            public ImageView ivItem;
            public ImageView ivItem1;
            public ImageView ivItem2;
            public ImageView ivMessage;
            public TextView tvComment;
            public TextView tvTime;

            public MyHolder3(View itemView) {
                super(itemView);
                this.rootView = itemView;
                this.tvTitle = (TextView) rootView.findViewById(R.id.tv_title);
                this.ivItem = (ImageView) rootView.findViewById(R.id.iv_item);
                this.ivItem1 = (ImageView) rootView.findViewById(R.id.iv_item2);
                this.ivItem2 = (ImageView) rootView.findViewById(R.id.iv_item3);
                this.ivMessage = (ImageView) rootView.findViewById(R.id.iv_message);
                this.tvComment = (TextView) rootView.findViewById(R.id.tv_comment);
                this.tvTime = (TextView) rootView.findViewById(R.id.tv_time);

            }

        }
    }

}
