package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreForTeamA = 0;
    private int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    /**
     * Gets score for team A
     *
     */
    public int getScoreForTeamA(){
        return this.scoreForTeamA;
    }
    /**
     * Sets the score for team A
     */
    public int setScoreForTeamA(int score){
        this.scoreForTeamA = score;
        return scoreForTeamA;
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void decreaseTeamA(View view){
        if (scoreForTeamA > 0) {
            displayForTeamA(
                    setScoreForTeamA(
                            getScoreForTeamA() - 1));
        }

    }
    /**
     * Adds three points for Team A.
     */

    public void addThreeForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }
    /**
     * Adds two points for team A
     */

    public void addTwoForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }
    /**
     * Adds one point for Team A.
     */

    public void addOneForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }
    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds three points for Team B.
     */

    public void addThreeForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);
    }
    /**
     * Adds two points for Team B.
     */

    public void addTwoForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }
    /**
     * Adds one point for Team B.
     */

    public void addOneForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }
    /**
     * Resets score for both Team A and Team B.
     */

    public void resetScore(View view) {
        scoreForTeamA = 0;
        displayForTeamA(scoreForTeamA);
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
    }
}
