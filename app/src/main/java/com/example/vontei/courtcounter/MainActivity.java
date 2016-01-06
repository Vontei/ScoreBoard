package com.example.vontei.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int finalScore = 0;
    int finalScoreB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(finalScore);
        displayForTeamB(finalScoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeA(View v){
        finalScore = finalScore+3;
        displayForTeamA(finalScore);
    }

    public void addTwoA(View v){
        finalScore = finalScore+2;
        displayForTeamA(finalScore);
    }
    public void addOneA(View v){
        finalScore = finalScore+1;
        displayForTeamA(finalScore);
    }



    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeB(View v){
        finalScoreB = finalScoreB+3;
        displayForTeamB(finalScoreB);
    }

    public void addTwoB(View v){
        finalScoreB = finalScoreB+2;
        displayForTeamB(finalScoreB);
    }
    public void addOneB(View v){
        finalScoreB = finalScoreB+1;
        displayForTeamB(finalScoreB);
    }

    public void reset(View v){
        finalScore = 0;
        finalScoreB = 0;
        displayForTeamB(0);
        displayForTeamA(0);
    }
}
