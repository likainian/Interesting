package com.interesting.administrator.interesting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 16/11/18.
 */

public class MyViewGroup extends RelativeLayout {
    private int image;
    private String title;
    private String content;
    private int color;

    private ImageView mItImage;
    private TextView mItTitle;
    private TextView mItContent;
    private ImageView mIvRight;


    public MyViewGroup(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.item_button_orange, this, true);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_button_orange, this, true);
        TypedArray type = context.obtainStyledAttributes(attrs, R.styleable.MyViewGroup);
        image = type.getResourceId(R.styleable.MyViewGroup_image, R.id.iv_change);
        title = type.getString(R.styleable.MyViewGroup_title);
        content = type.getString(R.styleable.MyViewGroup_content);
        color = type.getColor(R.styleable.MyViewGroup_color, getResources().getColor(R.color.orange));
        type.recycle();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mItImage = (ImageView) findViewById(R.id.it_image);
        mItTitle = (TextView) findViewById(R.id.it_title);
        mItContent = (TextView) findViewById(R.id.it_content);
        mItImage.setImageResource(image);
        mItTitle.setText(title);
        mItContent.setText(content);
        mItContent.setTextColor(color);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed,l,t,r,b);
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
        mItImage.setImageResource(image);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        mItTitle.setText(title);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        mItContent.setText(content);
    }
}
