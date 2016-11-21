package com.interesting.administrator.interesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.interesting.administrator.interesting.Collect;
import com.interesting.administrator.interesting.MyHelper;
import com.interesting.administrator.interesting.R;

import java.util.ArrayList;

public class CollectActivity extends AppCompatActivity {


    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> url = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private ListView mListCollect;
    private ActionBar mBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        initBar();
        initView();
        initData();
        initAdapter();
        initListener();
    }

    private void initListener() {
        mListCollect.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CollectActivity.this, ContentActivity.class);
                intent.putExtra("url",url.get(position));
                startActivity(intent);
            }
        });
    }

    private void initBar() {
        mBar = getSupportActionBar();
        mBar.setTitle("我的收藏");
        mBar.setHomeButtonEnabled(true);
        mBar.setDisplayHomeAsUpEnabled(true);
    }
    private void initView() {
        mListCollect = (ListView) findViewById(R.id.list_collect);
    }

    private void initData() {
        MyHelper myHelper = new MyHelper(CollectActivity.this);
        String db = myHelper.getDatabaseName();
        for (Collect col : myHelper.getAllData()) {
            list.add(col.getTitle());
            url.add(col.getUrl());
        }
    }

    private void initAdapter() {
        adapter = new ArrayAdapter<>(CollectActivity.this, android.R.layout.simple_spinner_dropdown_item, list);
        mListCollect.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
