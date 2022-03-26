package com.company;

public class Sad extends Moody{

    @Override
    public String getMood() {
        return "I feel sad Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    public String toString(){
        return "“Subject cries a lot”";
    }

    @Override
    public void queryMood() {
        System.out.println("Querying sad mood");
    }
}
