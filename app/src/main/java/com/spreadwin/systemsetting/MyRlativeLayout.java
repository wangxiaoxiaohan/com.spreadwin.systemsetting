package com.spreadwin.systemsetting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by hs-acer on 2018/4/17.
 */

public class MyRlativeLayout extends RelativeLayout {
    private  Boolean isMove=false;
    public MyRlativeLayout(Context context) {
        super(context);
    }

    public MyRlativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRlativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case  MotionEvent.ACTION_MOVE:
                isMove=true;
             case MotionEvent.ACTION_UP:
                 if (!isMove){
                     return  false;
                 }else {

                 }
                 isMove=false;
        }
        return super.onTouchEvent(event);
    }
}
