package com.example.dujinqiao.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Button;

import org.w3c.dom.Text;

public class buttonDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);

        Button button = (Button) findViewById(R.id.Button01);
        ImageButton imageButton = (ImageButton) findViewById(R.id.ImageButton01);
        button.setText("button");
        imageButton.setImageResource(R.drawable.img01);
        final TextView textView = (TextView) findViewById(R.id.TextView01);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textView.setText("button");
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textView.setText("imageButton");
            }
        });

        Button.OnClickListener buttonListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.Button01:
                        textView.setText("button");
                        return;
                    case R.id.ImageButton01:
                        textView.setText("imageButton");
                        return;

                }
            }
        };

        button.setOnClickListener(buttonListener);
        imageButton.setOnClickListener(buttonListener);

    }
}
