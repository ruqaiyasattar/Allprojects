package com.example.android.habit_tracking_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
HabitDBHelper h_db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h_db = new HabitDBHelper(this);
        Button addhabit=(Button)findViewById(R.id.button);
        Button gethabit=(Button)findViewById(R.id.button2);

        addhabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_db.addhabit(1,"abc user",21,"female","Reading Articles","Monday",1);
            }
        });
        gethabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_db.gethabit();
            }
        });

    }
}
