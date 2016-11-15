package com.interesting.administrator.interesting;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.interesting.administrator.interesting.fragment.HomeFragment;
import com.interesting.administrator.interesting.fragment.VideoFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int pro;
    private RadioGroup radioGroup;
    private ArrayList<Fragment> list = new ArrayList<>();
    private long exitTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                int position = Integer.parseInt(rb.getTag().toString());
                if(list.get(position).isAdded()){
                    getSupportFragmentManager().beginTransaction().show(list.get(position)).commit();
                }else{
                    getSupportFragmentManager().beginTransaction().add(R.id.frame,list.get(position)).commit();
                }
                getSupportFragmentManager().beginTransaction().hide(list.get(pro)).commit();
                pro =position;
            }
        });
    }
    private void initFragment() {
        list.add(HomeFragment.newInstance());
        list.add(VideoFragment.newInstance());
        list.add(VideoFragment.newInstance());
        getSupportFragmentManager().beginTransaction().add(R.id.frame,list.get(0)).commit();
    }

    private void initView() {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() - exitTime>2000){
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        }else{
            finish();
        }
    }
}
