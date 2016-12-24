package com.example.claudia.quizproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private int userScore;
    private TextView mScoreDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mScoreDisplay.setText(userScore);
    }
}
