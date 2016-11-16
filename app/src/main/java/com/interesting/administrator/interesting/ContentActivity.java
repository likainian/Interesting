package com.interesting.administrator.interesting;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ContentActivity extends Activity {

    private WebView mWebContent;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        url = getIntent().getStringExtra("url");
        initView();
        //设置让WebView支持显示javascript语言
        mWebContent.getSettings().setJavaScriptEnabled(true);
        mWebContent.getSettings().setSupportZoom(true);
        mWebContent.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        mWebContent.loadUrl(url);
    }

    private void initView() {
        mWebContent = (WebView) findViewById(R.id.web_content);
    }
    @Override
    public void onBackPressed() {
        //查看是否有上一个可显示的网页
        if (mWebContent.canGoBack()) {
            mWebContent.goBack();  // 回到上一个网页
        } else {
            finish();
        }
    }
}
