package com.company.Q4;

import java.util.Comparator;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printDetails(){
        System.out.println("Name : " +getName() +" | Score : " + getScore());
    }
}
