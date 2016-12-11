package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Count_It extends AppCompatActivity {
    ImageButton imageButton;
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count__it);

        TextView tA=(TextView)findViewById(R.id.tex1);
        tA.setText(getIntent().getExtras().getString("TeamA"));


        TextView tB=(TextView)findViewById(R.id.tex2);
        tB.setText(getIntent().getExtras().getString("TeamB"));

       /* int[] attrs = new int[]{R.attr.selectableItemBackground};
        TypedArray typedArray=obtainStyledAttributes(attrs);
        int backgroundResource = typedArray.getResourceId(0, 0);
        Button reset=(Button)findViewById(R.id.button);
        reset.setBackgroundResource(backgroundResource);*/
    }
    public void incrementTeamA(View v){

        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void incrementTeamB(View v){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void decrementTeamA(View v){
        if (scoreTeamA==0){
            Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA=scoreTeamA-1;
        displayForTeamA(scoreTeamA);
    }
    public void decrementTeamB(View v){
        if (scoreTeamB==0){
            Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB=scoreTeamB-1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v){
    /*    displayForTeamA(0);
        displayForTeamB(0);*/
        scoreTeamA=0;
        scoreTeamB=0;
        displayForreset(scoreTeamA,scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView2 = (TextView) findViewById(R.id.scoreB);
        scoreView2.setText(String.valueOf(score));}
    public void displayForreset(int score1,int score2) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score1));
        TextView scoreView2 = (TextView) findViewById(R.id.scoreB);
        scoreView2.setText(String.valueOf(score2));
    }}