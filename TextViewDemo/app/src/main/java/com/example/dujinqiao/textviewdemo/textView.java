package com.example.dujinqiao.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class textView extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView textView = (TextView) findViewById(R.id.TextView01);
        EditText editText = (EditText) findViewById(R.id.EditText01);
        textView.setText("username :");
        editText.setText("Robot");
    }


}
