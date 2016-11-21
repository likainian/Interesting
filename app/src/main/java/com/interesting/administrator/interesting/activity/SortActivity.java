package com.interesting.administrator.interesting.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.interesting.administrator.interesting.MyGridView;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.bean.HomeTitle;
import com.interesting.administrator.interesting.utils.BaseUrl;
import com.interesting.administrator.interesting.utils.OkHttpUtils;

import java.util.ArrayList;
import java.util.Collections;

public class SortActivity extends AppCompatActivity implements View.OnClickListener {

    private ActionBar mBar;
    private TextView mBtEdit;
    private MyGridView mGvHad;
    private TextView mTvAdd;
    private GridView mGvAdd;

    private ArrayList<HomeTitle.DataBean> hadTitleList = new ArrayList<>();
    private ArrayList<HomeTitle.DataBean> addTitleList = new ArrayList<>();
    private HadAdapter hadAdapter;
    private AddAdapter addAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        initBar();
        initView();
        initData();
        initAdapter();
        initListener();
    }

    private void initListener() {
        mGvHad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("tmd", "onItemClick: " + position);
                addTitleList.add(hadTitleList.get(position));
                hadTitleList.remove(position);
                addAdapter.notifyDataSetChanged();
                hadAdapter.notifyDataSetChanged();
            }
        });
        mGvHad.setOnSwapListener(new MyGridView.OnSwapListener() {
            @Override
            public void swap(int startPosition, int endPosition) {
                Collections.swap(hadTitleList,startPosition,endPosition);
                hadAdapter.notifyDataSetChanged();
            }
        });
        mGvAdd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("tmd", "onItemClick: " + position);
                hadTitleList.add(addTitleList.get(position));
                addTitleList.remove(position);
                addAdapter.notifyDataSetChanged();
                hadAdapter.notifyDataSetChanged();
            }
        });
    }

    private void initAdapter() {
        hadAdapter = new HadAdapter();
        mGvHad.setAdapter(hadAdapter);
        addAdapter = new AddAdapter();
        mGvAdd.setAdapter(addAdapter);
    }

    private void initBar() {
        mBar = getSupportActionBar();
        mBar.setTitle("频道管理");
        mBar.setHomeButtonEnabled(true);
        mBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        mBtEdit = (TextView) findViewById(R.id.bt_edit);
        mGvHad = (MyGridView) findViewById(R.id.gv_had);
        mTvAdd = (TextView) findViewById(R.id.tv_add);
        mGvAdd = (GridView) findViewById(R.id.gv_add);

        mBtEdit.setOnClickListener(this);
    }

    private void initData() {
        OkHttpUtils.newInstance().get(SortActivity.this, HomeTitle.class, BaseUrl.homeTitleUrl,
                new OkHttpUtils.TextCallBack<HomeTitle>() {
                    @Override
                    public void getText(HomeTitle homeTitle) {
                        hadTitleList.addAll(homeTitle.getData());
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_edit:
                if(mBtEdit.getText().toString().equals("编辑")){
                    mGvHad.setClick(true);
                }
                break;
        }
    }

    class HadAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return hadTitleList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(SortActivity.this).inflate(R.layout.item_button_shape, null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.btShape.setText(hadTitleList.get(position).getName());
            return convertView;
        }

        public class ViewHolder {
            public View rootView;
            public TextView btShape;

            public ViewHolder(View rootView) {
                this.rootView = rootView;
                this.btShape = (TextView) rootView.findViewById(R.id.bt_shape);
            }

        }
    }

    class AddAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return addTitleList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(SortActivity.this).inflate(R.layout.item_button_shape, null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.btShape.setText(addTitleList.get(position).getName());
            return convertView;
        }

        public class ViewHolder {
            public View rootView;
            public TextView btShape;

            public ViewHolder(View rootView) {
                this.rootView = rootView;
                this.btShape = (TextView) rootView.findViewById(R.id.bt_shape);
            }

        }
    }
}
