package com.interesting.administrator.interesting.fragment;


import android.content.Context;
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

import com.interesting.administrator.interesting.BaseUrl;
import com.interesting.administrator.interesting.OkHttpUtils;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.bean.VideoTitle;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {
    private Context context;
    private TabLayout mTabVideo;
    private ViewPager mPagerHome;
    private ArrayList<VideoTitle.DataBean> videoTitleList = new ArrayList<>();
    private ArrayList<Fragment> fragList = new ArrayList<>();
    private MyAdapter adapter;
    private String[] videoUrls = {BaseUrl.vedioGameUrl,BaseUrl.vedioJokeUrl,BaseUrl.vedioMessUrl,
    BaseUrl.vedioStarUrl,BaseUrl.vedioUnusUrl};


    public VideoFragment() {
        // Required empty public constructor
    }

    public static VideoFragment newInstance() {
        Bundle args = new Bundle();
        VideoFragment fragment = new VideoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTabVideo = (TabLayout) view.findViewById(R.id.tab_video);
        mPagerHome = (ViewPager) view.findViewById(R.id.pager_video);
        mTabVideo.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabVideo.setSelectedTabIndicatorColor(getResources().getColor(R.color.base));
        mTabVideo.setTabTextColors(Color.BLACK,getResources().getColor(R.color.base));
        initData();
        initAdapter();
    }
    private void initAdapter() {
        adapter = new MyAdapter(getChildFragmentManager());
        mPagerHome.setAdapter(adapter);
        mTabVideo.setupWithViewPager(mPagerHome);
    }

    private void initData() {
        OkHttpUtils.newInstance().get(getActivity(), VideoTitle.class, BaseUrl.vedioTitleUrl,
                new OkHttpUtils.TextCallBack<VideoTitle>() {

                    @Override
                    public void getText(VideoTitle videoTitle) {
                        videoTitleList.addAll(videoTitle.getData());
                        for (int i = 0; i < videoTitleList.size(); i++) {
                            fragList.add(VideoListFragment.newInstance(videoUrls[i]));
                        }
                        adapter.notifyDataSetChanged();
                    }
                });
    }
    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragList.get(position);
        }

        @Override
        public int getCount() {
            return videoTitleList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return videoTitleList.get(position).getName();
        }
    }
}
