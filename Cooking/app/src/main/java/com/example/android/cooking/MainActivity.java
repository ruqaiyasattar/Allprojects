package com.example.android.cooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Videos(View view){
        Intent i=new Intent (this,Main2Activity.class);
        startActivity(i);
    }
    public void Image(View view){
        Intent i=new Intent (this,Main3Activity.class);
        startActivity(i);
    }
}

