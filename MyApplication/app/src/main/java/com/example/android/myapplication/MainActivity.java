package com.example.android.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView =new TextView(this);
        textView.setText("Wowhghgggggggggggggfhffffffffffffffffffffffffffff!");
        textView.setTextSize(54);
        textView.setTextColor(Color.GREEN);
        textView.setMaxLines(7);


        setContentView(textView);
    }
}
