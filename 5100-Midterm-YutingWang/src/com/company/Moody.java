package com.company;

abstract class Moody {
    String mood;
    abstract public void queryMood();
    abstract public void expressFeelings();

    public String getMood() {
        return mood;
    }
}
