package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> obtaindmaeks=new  ArrayList<Integer>();
        obtaindmaeks.add(90);
        obtaindmaeks.add(80);
        obtaindmaeks.add(70);
        obtaindmaeks.add(50);
        obtaindmaeks.add(99);


        final ReportCard Card=new ReportCard(obtaindmaeks,"ABc","ANdroid","2016");

        Card.Addsubject("Android");
        Card.addgrade(80);
        Button showdata=(Button) findViewById(R.id.textv);

        showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "data"+ Card.toString(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}
