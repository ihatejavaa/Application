package com.example.claudia.quizproject;

/**
 * Created by Claudia on 24/12/2016.
 */

public class Score extends user{
    private int score = 0;

    private void addPoint(){
        score++;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int theScore) {
        this.score = theScore;
    }

    private void scoreInfo (int aScore, string aUser) {
        aScore = getScore();
        super.getUser();
    }
}
