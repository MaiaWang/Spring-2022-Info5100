package com.company;

public class Happy extends Moody{

    @Override
    public String getMood() {
        return "I feel happy Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("Querying happy mood");
    }
}
