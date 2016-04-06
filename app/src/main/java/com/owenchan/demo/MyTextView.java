package com.owenchan.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Owen Chan on 14-1-22.
 * Copyright © 2016 Owen Chan. All rights reserved.
 */

public class MyTextView extends TextView{

    private static final String TAG = MyTextView.class.getSimpleName();

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
//
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_UP");
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_CANCEL");
//                break;
//            default:
//                break;
//        }
//        boolean superReturn = super.dispatchTouchEvent(event);
//        Log.i(TAG, "[dispatchTouchEvent] return super. = " + superReturn);
//        return superReturn;
//    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "[onTouchEvent] -> ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "[onTouchEvent] -> ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "[onTouchEvent] -> ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "[onTouchEvent] -> ACTION_CANCEL");
                break;
            default:
                break;
        }

        return false;
//        boolean superReturn = super.onTouchEvent(event);
//        Log.i(TAG, "[onTouchEvent] return super. = " + superReturn);
//        return superReturn;
    }


}
