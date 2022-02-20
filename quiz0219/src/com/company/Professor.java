package com.company;

public class Professor extends Person {

    public Professor(String name, int ID, int age) {
        super(name, ID, age);
    }


    public void giveQuiz(){
        System.out.println("Professor "+ this.Name + "(ID: "+ this.ID+ ") is giving a quiz.");
    }
}
