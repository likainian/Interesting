package com.interesting.administrator.interesting.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16/11/15.
 */

public class HomeTitle {

    /**
     * code : 0
     * message : 成功
     * currentTime : 1479219387
     * data : [{"id":255,"name":"推荐"},{"id":1,"name":"社会"},{"id":6,"name":"娱乐"},{"id":5,"name":"养生"},{"id":2,"name":"搞笑"},{"id":3,"name":"奇闻"},{"id":4,"name":"励志"},{"id":7,"name":"科技"},{"id":8,"name":"百科"},{"id":10,"name":"财经"},{"id":9,"name":"汽车"},{"id":11,"name":"情感"},{"id":18,"name":"星座"},{"id":12,"name":"美食"},{"id":14,"name":"时尚"},{"id":16,"name":"旅游"},{"id":17,"name":"育儿"},{"id":13,"name":"体育"},{"id":15,"name":"军事"}]
     */

    private int code;
    private String message;
    private int currentTime;
    /**
     * id : 255
     * name : 推荐
     */

    private List<DataBean> data;

    public static HomeTitle objectFromData(String str) {

        return new Gson().fromJson(str, HomeTitle.class);
    }

    public static HomeTitle objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomeTitle.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomeTitle> arrayTitleBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomeTitle>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomeTitle> arrayTitleBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomeTitle>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String name;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
