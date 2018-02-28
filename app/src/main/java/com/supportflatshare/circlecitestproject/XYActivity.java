package com.supportflatshare.circlecitestproject;

import android.app.Activity;

// find the potential issues with this code
public class XYActivity extends Activity {

    // init variables
    private final Object LOCK = new Object();
    //private NetworkManager networkManager;
    private int value;
//
//    public void onCreate(Bundle savedState) {
//        super.onCreate(savedState);
//        new Thread() {
//            @Override
//            public void run() {
//                setValue();
//            }
//        }.start();
//
//        Button b = findViewById(R.id.button);
//        b.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                b.setText(getValue());
//            }
//        });
//    }
//
//    public  void setValue() {
//        synchronized(LOCK) {
//            value = networkManager.calculateValue();
//        }
//    }
//
//    public int getValue() {
//        synchronized(LOCK) {
//            return value;
//        }
//    }

}
