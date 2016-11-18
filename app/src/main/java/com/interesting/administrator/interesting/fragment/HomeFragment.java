package com.interesting.administrator.interesting.fragment;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.interesting.administrator.interesting.activity.SortActivity;
import com.interesting.administrator.interesting.utils.BaseUrl;
import com.interesting.administrator.interesting.utils.OkHttpUtils;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.bean.HomeTitle;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private Context context;
    private TabLayout mTabHome;
    private ViewPager mPagerHome;
    private ImageView mIvChange;
    private ArrayList<HomeTitle.DataBean> homeTitleList = new ArrayList<>();
    private ArrayList<Fragment> fragList = new ArrayList<>();
    private MyAdapter adapter;
    private String[] homeUrls = {BaseUrl.hometuijianUrl,BaseUrl.homeshehuiUrl,BaseUrl.homegaoxiaoUrl,
            BaseUrl.homeqiwenUrl,BaseUrl.homelizhiUrl,BaseUrl.homeyangshengUrl,BaseUrl.homeyuleUrl,
            BaseUrl.homekejiUrl,BaseUrl.homebaikeUrl,BaseUrl.homeqicheUrl,BaseUrl.homecaijingUrl,
            BaseUrl.homeqingganUrl,BaseUrl.homemeishiUrl,BaseUrl.hometiyuUrl,BaseUrl.homeshishangUrl,
            BaseUrl.homejunshiUrl,BaseUrl.homelvyouUrl,BaseUrl.homeyuerUrl,BaseUrl.homexingzuoUrl};

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        
        Bundle args = new Bundle();
        
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTabHome = (TabLayout) view.findViewById(R.id.tab_video);
        mPagerHome = (ViewPager) view.findViewById(R.id.pager_video);
        mIvChange = (ImageView) view.findViewById(R.id.iv_change);
        mIvChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SortActivity.class));
            }
        });
        mTabHome.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabHome.setSelectedTabIndicatorColor(getResources().getColor(R.color.base));
        mTabHome.setTabTextColors(Color.BLACK,getResources().getColor(R.color.base));
        initData();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new MyAdapter(getChildFragmentManager());
        mPagerHome.setAdapter(adapter);
        mTabHome.setupWithViewPager(mPagerHome);
    }

    private void initData() {
        OkHttpUtils.newInstance().get(getActivity(), HomeTitle.class, BaseUrl.homeTitleUrl,
                new OkHttpUtils.TextCallBack<HomeTitle>() {

                    @Override
                    public void getText(HomeTitle homeTitle) {
                        homeTitleList.addAll(homeTitle.getData());
                        for (int i = 0; i < homeTitleList.size(); i++) {
                            fragList.add(HomeListFragment.newInstance(homeUrls[i]));
                        }
                        adapter.notifyDataSetChanged();
                    }
                });
    }
    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragList.get(position);
        }

        @Override
        public int getCount() {
            return homeTitleList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return homeTitleList.get(position).getName();
        }
    }

}
