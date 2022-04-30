package com.example.CourtCounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);

        /** To change text colour of toolbar */
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);
    }
    /**------------------------------------------------*/
    /** java for team A */

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /** 3 pointer score */
    public void points3TeamA(View view){
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    /** 2 pointer score */
    public void points2TeamA(View view){
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    /** free throw score */
    public void points1TeamA(View view){
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }
    /**------------------------------------------------*/
    /** java for team b */
    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }
    /** 3 pointer score */
    public void points3TeamB(View view){
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    /** 2 pointer score */
    public void points2TeamB(View view){
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    /** free throw score */
    public void points1TeamB(View view){
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }
    /**------------------------------------------------*/
    /** java for RESET button */
    public void reset(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayScoreTeamB(scoreTeamB);
        displayScoreTeamA(scoreTeamA);
    }


}