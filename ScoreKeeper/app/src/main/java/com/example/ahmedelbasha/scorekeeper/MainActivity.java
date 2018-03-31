package com.example.ahmedelbasha.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addFieldGoalForTeamA = findViewById(R.id.add_three_points_for_team_a_button);

        addFieldGoalForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                displayScoreForTeamA(scoreTeamA);
            }
        });

        Button addTouchdownForTeamA = findViewById(R.id.add_six_points_for_team_a_button);

        addTouchdownForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 6;
                displayScoreForTeamA(scoreTeamA);
            }
        });

        Button addTryForExtraPointForTeamA = findViewById(R.id.add_one_point_for_team_a_button);

        addTryForExtraPointForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                displayScoreForTeamA(scoreTeamA);
            }
        });

        Button addSafetyForTeamA = findViewById(R.id.add_two_points_for_team_a_button);

        addSafetyForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                displayScoreForTeamA(scoreTeamA);
            }
        });

        Button addFieldGoalForTeamB = findViewById(R.id.add_three_points_for_team_b_button);

        addFieldGoalForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                displayScoreForTeamB(scoreTeamB);
            }
        });

        Button addTouchdownForTeamB = findViewById(R.id.add_six_points_for_team_b_button);

        addTouchdownForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 6;
                displayScoreForTeamB(scoreTeamB);
            }
        });

        Button addTryForExtraPointForTeamB = findViewById(R.id.add_one_point_for_team_b_button);

        addTryForExtraPointForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 1;
                displayScoreForTeamB(scoreTeamB);
            }
        });

        Button addSafetyForTeamB = findViewById(R.id.add_two_points_for_team_b_button);

        addSafetyForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                displayScoreForTeamB(scoreTeamB);
            }
        });

        Button resetScoreButton = findViewById(R.id.reset_score_button);

        resetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayScoreForTeamA(scoreTeamA);
                displayScoreForTeamB(scoreTeamB);
            }
        });
    }

    private void displayScoreForTeamA(int score) {
        TextView teamAScoreText = findViewById(R.id.team_a_score);
        teamAScoreText.setText(String.valueOf(score));
    }

    private void displayScoreForTeamB(int score) {
        TextView teamBScoreText = findViewById(R.id.team_b_score);
        teamBScoreText.setText(String.valueOf(score));
    }
}
