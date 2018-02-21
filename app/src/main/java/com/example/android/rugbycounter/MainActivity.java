package com.example.android.rugbycounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * This activity keeps track of the Rugby score for 2 teams.
     */

    // Tracks the score for Team XV de France
    int scoreTeamFrance = 0;

    // Tracks the score for Team All Blacks
    int scoreTeamBlacks = 0;
    TextView teamF;
    TextView teamB;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamF = (TextView) findViewById(R.id.team_france_score);
        teamB = (TextView) findViewById(R.id.team_blacks_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        outState.putString("TEXT", (String) teamF.getText());
        outState.putString("TEXT", (String) teamB.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onRestoreInstanceState(savedInstanceState);
        teamF.setText(savedInstanceState.getString("TEXT"));
        teamB.setText(savedInstanceState.getString("TEXT"));

    }
        /**
         * Increase the score for Team France by 5 points.
         */

    public void addFiveForFrance(View v) {
        scoreTeamFrance = scoreTeamFrance + 5;
        displayForFrance(scoreTeamFrance);
    }

    /**
     * Increase the score for Team France by 2 points.
     */
    public void addTwoForFrance(View v) {
        scoreTeamFrance = scoreTeamFrance + 2;
        displayForFrance(scoreTeamFrance);
    }

    /**
     * Increase the score for Team France by 3 points.
     */
    public void addThreeForFrance(View v) {
        scoreTeamFrance = scoreTeamFrance + 3;
        displayForFrance(scoreTeamFrance);
    }

    /**
     * Increase the score for Team Blacks by 5 points.
     */
    public void addFiveForBlacks(View v) {
        scoreTeamBlacks = scoreTeamBlacks + 5;
        displayForBlacks(scoreTeamBlacks);
    }

    /**
     * Increase the score for Team Blacks by 2 points.
     */
    public void addTwoForBlacks(View v) {
        scoreTeamBlacks = scoreTeamBlacks + 2;
        displayForBlacks(scoreTeamBlacks);
    }

    /**
     * Increase the score for Team Blacks by 3 points.
     */
    public void addThreeForBlacks(View v) {
        scoreTeamBlacks = scoreTeamBlacks + 3;
        displayForBlacks(scoreTeamBlacks);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamFrance = 0;
        scoreTeamBlacks = 0;
        displayForFrance(scoreTeamFrance);
        displayForBlacks(scoreTeamBlacks);
    }

    /**
     * Displays the given score for Team France.
     */
    public void displayForFrance(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_france_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Blacks.
     */
    public void displayForBlacks(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_blacks_score);
        scoreView.setText(String.valueOf(score));
    }
}
