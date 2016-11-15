package com.interesting.administrator.interesting.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.interesting.administrator.interesting.BaseUrl;
import com.interesting.administrator.interesting.OkHttpUtils;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.bean.HomeTitle;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private Context context;
    private TabLayout mTabHome;
    private FrameLayout mFrameHome;
    ArrayList<HomeTitle.DataBean> homeTitleList = new ArrayList<>();

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
        mTabHome = (TabLayout) view.findViewById(R.id.tab_home);
        mFrameHome = (FrameLayout) view.findViewById(R.id.frame_home);
        initData();
        initAdapter();
    }

    private void initAdapter() {


    }

    private void initData() {
        OkHttpUtils.newInstance().get(getActivity(), HomeTitle.class, BaseUrl.homeTitleUrl,
                new OkHttpUtils.TextCallBack<HomeTitle>() {

                    @Override
                    public void getText(HomeTitle homeTitle) {
                        homeTitleList.addAll(homeTitle.getData());
                    }
                });
    }
}
