package com.interesting.administrator.interesting.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.interesting.administrator.interesting.MyViewGroup;
import com.interesting.administrator.interesting.R;
import com.interesting.administrator.interesting.activity.CollectActivity;
import com.interesting.administrator.interesting.activity.ContentActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment implements View.OnClickListener {
    public Button mBtMessage;
    public Button mBtSetting;
    public ImageView mIvHead;
    public TextView mTvHead;
    public TextView mTvGold;
    public TextView mTvChange;
    public ImageView mItImage;
    public TextView mItTitle;
    public MyViewGroup mBtNewbie;
    public MyViewGroup mBtCode;
    public MyViewGroup mBtChat;
    public MyViewGroup mBtTask;
    public MyViewGroup mBtBalance;
    public MyViewGroup mBtOrder;
    public MyViewGroup mBtGame;
    public MyViewGroup mBtExchange;
    public MyViewGroup mBtLearn;
    public Button mBtCollect;
    public Button mBtHistory;

    public MineFragment() {
        // Required empty public constructor
    }

    public static MineFragment newInstance() {

        Bundle args = new Bundle();

        MineFragment fragment = new MineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_mine, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }


    public void initView(View rootView) {
        this.mBtMessage = (Button) rootView.findViewById(R.id.bt_message);
        this.mBtMessage.setOnClickListener(this);
        this.mBtSetting = (Button) rootView.findViewById(R.id.bt_setting);
        this.mBtSetting.setOnClickListener(this);
        this.mIvHead = (ImageView) rootView.findViewById(R.id.iv_head);
        this.mIvHead.setOnClickListener(this);
        this.mTvHead = (TextView) rootView.findViewById(R.id.tv_head);
        this.mTvHead.setOnClickListener(this);
        this.mTvGold = (TextView) rootView.findViewById(R.id.tv_gold);
        this.mTvGold.setOnClickListener(this);
        this.mTvChange = (TextView) rootView.findViewById(R.id.tv_change);
        this.mTvChange.setOnClickListener(this);
        this.mItImage = (ImageView) rootView.findViewById(R.id.it_image);
        this.mItImage.setOnClickListener(this);
        this.mItTitle = (TextView) rootView.findViewById(R.id.it_title);
        this.mItTitle.setOnClickListener(this);
        this.mBtNewbie = (MyViewGroup) rootView.findViewById(R.id.bt_newbie);
        this.mBtNewbie.setOnClickListener(this);
        this.mBtCode = (MyViewGroup) rootView.findViewById(R.id.bt_code);
        this.mBtCode.setOnClickListener(this);
        this.mBtChat = (MyViewGroup) rootView.findViewById(R.id.bt_chat);
        this.mBtChat.setOnClickListener(this);
        this.mBtTask = (MyViewGroup) rootView.findViewById(R.id.bt_task);
        this.mBtTask.setOnClickListener(this);
        this.mBtBalance = (MyViewGroup) rootView.findViewById(R.id.bt_balance);
        this.mBtBalance.setOnClickListener(this);
        this.mBtOrder = (MyViewGroup) rootView.findViewById(R.id.bt_order);
        this.mBtOrder.setOnClickListener(this);
        this.mBtGame = (MyViewGroup) rootView.findViewById(R.id.bt_game);
        this.mBtGame.setOnClickListener(this);
        this.mBtExchange = (MyViewGroup) rootView.findViewById(R.id.bt_exchange);
        this.mBtExchange.setOnClickListener(this);
        this.mBtLearn = (MyViewGroup) rootView.findViewById(R.id.bt_learn);
        this.mBtLearn.setOnClickListener(this);
        this.mBtCollect = (Button) rootView.findViewById(R.id.bt_collect);
        this.mBtCollect.setOnClickListener(this);
        this.mBtHistory = (Button) rootView.findViewById(R.id.bt_history);
        this.mBtHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_message:
                break;
            case R.id.bt_setting:
                break;
            case R.id.iv_head:
                break;
            case R.id.tv_head:
                break;
            case R.id.tv_gold:
                break;
            case R.id.tv_change:
                break;
            case R.id.it_image:
                break;
            case R.id.it_title:
                break;
            case R.id.bt_newbie:
                Intent intent = new Intent(getActivity(), ContentActivity.class);
                intent.putExtra("url","http://h5ssl.1sapp.com/qukan/qd.html?r=56&v=10204&lat=31.38082&lon=121.4867&network=wifi&dc=285508002700282&dtu=003");
                startActivity(intent);
                break;
            case R.id.bt_code:
                break;
            case R.id.bt_chat:
                break;
            case R.id.bt_task:
                break;
            case R.id.bt_balance:
                break;
            case R.id.bt_order:
                break;
            case R.id.bt_game:
                break;
            case R.id.bt_exchange:
                break;
            case R.id.bt_learn:
                break;
            case R.id.bt_collect:
                startActivity(new Intent(getActivity(),CollectActivity.class));
                break;
            case R.id.bt_history:
                break;

        }
    }
}
