package com.example.dujinqiao.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "LIFTCYCLE";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1) onCreate()");

        Button button = (Button)findViewById(R.id.btn_finish);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "(3) onRestoreInstanceState()");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG, "(4) onResume()");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "(5) onSaveInstanceState()");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i(TAG, "(6) onRestart()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG, "(7) onPause()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i(TAG, "(8) onStop()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "(9) onDestroy()");
    }




}
