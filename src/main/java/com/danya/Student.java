package com.danya;

public class Student extends Person{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("Invalid score value!");
        }
        this.score = score;
    }


}
