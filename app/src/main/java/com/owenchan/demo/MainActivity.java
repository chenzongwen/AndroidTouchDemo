package com.owenchan.demo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        switch (ev.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_DOWN");
//                break;
//                //Log.i(TAG, "[dispatchTouchEvent] -> ACTION_DOWN, return true");
//                //return true;
//            case MotionEvent.ACTION_MOVE:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_MOVE");
//                break;
//                //Log.i(TAG, "[dispatchTouchEvent] -> ACTION_MOVE, return true");
//                //return true;
//            case MotionEvent.ACTION_UP:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_UP");
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                Log.d(TAG, "[dispatchTouchEvent] -> ACTION_CANCEL");
//                break;
//            default:
//                break;
//        }
//        boolean superReturn = super.dispatchTouchEvent(ev);
//        Log.i(TAG, "[dispatchTouchEvent] return super. = " + superReturn);
//        return superReturn;
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.d(TAG, "[onTouchEvent] -> ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.d(TAG, "[onTouchEvent] -> ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.d(TAG, "[onTouchEvent] -> ACTION_UP");
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                Log.d(TAG, "[onTouchEvent] -> ACTION_CANCEL");
//                break;
//            default:
//                break;
//        }
//        boolean superReturn = super.onTouchEvent(event);
//        Log.i(TAG, "[onTouchEvent] return super. = " + superReturn);
//        return superReturn;
//    }


}
