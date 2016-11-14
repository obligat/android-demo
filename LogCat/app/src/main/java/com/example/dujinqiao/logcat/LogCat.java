package com.example.dujinqiao.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LogCat extends AppCompatActivity {

    final static String TAG = "LOGCAT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_cat);

        Log.v(TAG, "verbose");
        Log.d(TAG, "debug");
        Log.i(TAG, "info");
        Log.w(TAG, "warn");
        Log.e(TAG, "error");

    }


}
