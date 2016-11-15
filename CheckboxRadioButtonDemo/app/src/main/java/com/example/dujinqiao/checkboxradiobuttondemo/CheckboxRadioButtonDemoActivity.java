package com.example.dujinqiao.checkboxradiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.CheckBox;

public class CheckboxRadioButtonDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_radio_button_demo);

        final TextView textView = (TextView) findViewById(R.id.TextView01);

        final CheckBox checkBox01 = (CheckBox) findViewById(R.id.CheckBox01);
        final CheckBox checkBox02 = (CheckBox) findViewById(R.id.CheckBox02);

        CheckBox.OnClickListener checkBoxListener = new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.CheckBox01:
                        textView.setText("CheckBox01, isChecked:" + String.valueOf(checkBox01.isChecked()));
                        return;
                    case R.id.CheckBox02:
                        textView.setText("CheckBox02, isChecked:" + String.valueOf(checkBox02.isChecked()));
                        return;
                }
            }
        };

        checkBox01.setOnClickListener(checkBoxListener);
        checkBox02.setOnClickListener(checkBoxListener);

        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.RadioButton01);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.RadioButton02);
        RadioButton.OnClickListener radioButtonListener = new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.RadioButton01:
                        textView.setText("RadioButton1 is selected");
                        return;
                    case R.id.RadioButton02:
                        textView.setText("RadioButton2 is selected");
                        return;
                }
            }
        };

        radioButton1.setOnClickListener(radioButtonListener);
        radioButton2.setOnClickListener(radioButtonListener);
    }
}
