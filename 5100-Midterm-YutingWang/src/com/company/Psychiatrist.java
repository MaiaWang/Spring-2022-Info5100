package com.company;

public class Psychiatrist {

    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        System.out.println(moody.getMood());
        moody.expressFeelings();
    }
    public void observe(Moody moody){
        System.out.println("Observation : " + moody.toString());
    }
}
