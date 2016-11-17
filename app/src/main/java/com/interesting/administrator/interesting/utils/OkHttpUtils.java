package com.interesting.administrator.interesting.utils;

import android.app.Activity;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 16/10/31.
 */

public class OkHttpUtils {
    private static OkHttpUtils okHttpUtils;
    private final OkHttpClient client;

    private OkHttpUtils(){
        client = new OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.HOURS)
                .build();
    }

    public static OkHttpUtils newInstance() {
        if(okHttpUtils ==null){
            okHttpUtils = new OkHttpUtils();
        }
        return okHttpUtils;
    }
    public <T extends Object>T get(String url,Class<T> clazz){
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response result = client.newCall(request).execute();
            T zb = new Gson().fromJson(result.body().string(), clazz);
            return zb;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public interface TextCallBack<T>{
        void getText(T t);
    }
    public <T extends Object>void get(final Activity activity, final Class<T> clazz, String url, final TextCallBack textCallBack){
        final Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final T t = new Gson().fromJson(response.body().string(), clazz);
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textCallBack.getText(t);
                    }
                });

            }
        });
    }
    public <T extends Object>T post(String url, HashMap<String,String> map, Class<T> clazz){
        FormBody.Builder builder = new FormBody.Builder();
        Set<String> set = map.keySet();
        for(String key:set){
            builder.add(key,map.get(key));
        }

        Request request = new Request.Builder()
                .post(builder.build())
                .url(url)
                .build();
        try {
            Response result = client.newCall(request).execute();
            T zb = new Gson().fromJson(result.body().string(), clazz);
            return zb;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public <T extends Object>void post(final Activity activity,HashMap<String,String>map, final Class<T> clazz, String url, final TextCallBack textCallBack){
        FormBody.Builder builder = new FormBody.Builder();
        Set<String> set = map.keySet();
        for(String key:set){
            builder.add(key,map.get(key));
        }

        Request request = new Request.Builder()
                .post(builder.build())
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final T t = new Gson().fromJson(response.body().string(), clazz);
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textCallBack.getText(t);
                    }
                });

            }
        });
    }
}
