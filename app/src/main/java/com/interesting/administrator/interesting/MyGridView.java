package com.interesting.administrator.interesting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridView;


/**
 * Created by Administrator on 16/11/21.
 */

public class MyGridView extends GridView {
    private float startx;
    private float starty;
    private int startPosition;
    private int endPosition;
    public OnSwapListener swapListener;
    private View startView;
    private boolean isClick;

    public interface OnSwapListener {
        void swap(int startPosition, int endPosition);
    }


    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        View view = getChildAt(0);
        int width = view.getWidth();
        int height = view.getHeight();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startx = ev.getX();
                starty = ev.getY();
                int startPositionx = (int) startx / width;
                int startPositiony = (int) starty / height;
                startPosition = startPositionx + 4 * startPositiony;
                startView = getChildAt(startPosition);
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                float endx = ev.getX();
                float endy = ev.getY();
                int endPositionx = (int) endx / width;
                int endPositiony = (int) endy / height;
                endPosition = endPositionx + 4 * endPositiony;
                swapListener.swap(startPosition, endPosition);
                break;
        }
        if(endPosition == startPosition){
            return false;
        }else{
            return true;
        }
    }

    public void setOnSwapListener(OnSwapListener swapListener) {
        this.swapListener = swapListener;
    }

    public void setClick(boolean isClick) {
        this.isClick = isClick;
    }
}
