package com.example.android.scorekeeperapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText team1=(EditText) findViewById(R.id.Team_A);
        final EditText team2=(EditText) findViewById(R.id.Team_B);
        EditText tv = (EditText) findViewById(R.id.Team_B);
        tv.setMovementMethod(new ScrollingMovementMethod());
        Button ok_buttn=(Button) findViewById(R.id.ok);
     /*   View backgroundImage = findViewById(R.id.bgimg);
        Drawable background = backgroundImage.getBackground();
        background.setAlpha(90);*/
        ok_buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Count_It.class);
                i.putExtra("TeamA",team1.getText().toString());
                i.putExtra("TeamB",team2.getText().toString());
                startActivity(i);
            }
        });
    }


}
