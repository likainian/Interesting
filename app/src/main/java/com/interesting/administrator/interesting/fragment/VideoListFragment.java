package com.interesting.administrator.interesting.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.interesting.administrator.interesting.Collect;
import com.interesting.administrator.interesting.MyHelper;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.activity.ContentActivity;
import com.interesting.administrator.interesting.bean.VideoBean;
import com.interesting.administrator.interesting.utils.OkHttpUtils;

import java.util.ArrayList;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoListFragment extends Fragment {
    public RecyclerView mRecycleView;
    public SwipeRefreshLayout mSwipeRefresh;
    private int pager;
    private Context context;
    private LinearLayoutManager manager;
    private MyAdapter adapter;
    private ArrayList<VideoBean.WDataBean.DataBean> list = new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();
    private SharedPreferences collect;
    private SQLiteDatabase db;
    private MyHelper myHelper;

    public VideoListFragment() {
        // Required empty public constructor
    }

    public static VideoListFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString("url", url);
        VideoListFragment fragment = new VideoListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        myHelper = new MyHelper(context);
        db = myHelper.getReadableDatabase();
        collect = context.getSharedPreferences("collect", Context.MODE_PRIVATE);
        return inflater.inflate(R.layout.fragment_video_list, container, false);
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
                    ++pager;
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
        OkHttpUtils.newInstance().get(getActivity(), VideoBean.class, getArguments().getString("url"),
                new OkHttpUtils.TextCallBack<VideoBean>() {

                    @Override
                    public void getText(VideoBean videoBean) {
                        list.addAll(videoBean.getData().getData());
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
            holder = new MyHolder1(LayoutInflater.from(context).inflate(R.layout.item_video, null));

            return holder;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final MyHolder1 holder1 = (MyHolder1) holder;
            holder1.rootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), ContentActivity.class);
                    intent.putExtra("url",list.get(position).getUrl());
                    startActivity(intent);
                }
            });
            holder1.ivStar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    SharedPreferences.Editor edit = collect.edit();
//                    edit.putString(list.get(position).getTitle(),list.get(position).getUrl());
//                    edit.commit();
                    myHelper.addBySql(new Collect(list.get(position).getTitle(),list.get(position).getUrl()));
                    holder1.ivStar.setImageResource(R.drawable.stared);
                    title.add(list.get(position).getTitle());
                    Toast.makeText(context, "收藏成功", Toast.LENGTH_SHORT).show();
                }
            });
            if (list.get(position).getTips().equals("视频")) {
                Glide.with(context).load(list.get(position).getCover().get(0)).into(holder1.ivItem);
                holder1.tvTitle.setText(list.get(position).getTitle());
                holder1.tvComment.setText(list.get(position).getRead_count()+"次播放");
            } else {
                holder1.tvComment.setText(list.get(position).getTips());
            }
            if(title.contains(list.get(position).getTitle())){
                holder1.ivStar.setImageResource(R.drawable.stared);
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
            public ImageView ivStar;
            public ImageView ivShare;

            public MyHolder1(View itemView) {
                super(itemView);
                this.rootView = itemView;
                this.ivItem = (ImageView) rootView.findViewById(R.id.iv_item);
                this.tvTitle = (TextView) rootView.findViewById(R.id.tv_title);
                this.ivMessage = (ImageView) rootView.findViewById(R.id.iv_message);
                this.tvComment = (TextView) rootView.findViewById(R.id.tv_comment);
                this.ivStar = (ImageView) rootView.findViewById(R.id.iv_star);
                this.ivShare = (ImageView) rootView.findViewById(R.id.iv_share);
                ivShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showShare();
                    }
                });
            }
        }

    }

    private void showShare() {
        ShareSDK.initSDK(context);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

// 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle("标题");
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        //分享网络图片，新浪微博分享网络图片需要通过审核后申请高级写入接口，否则请注释掉测试新浪微博
        oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite("ShareSDK");
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

// 启动分享GUI
        oks.show(context);
    }
}
