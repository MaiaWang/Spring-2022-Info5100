package com.company;

public class Main {

    public static void main(String[] args) {

        Professor bob = new Professor("Bob", 001,45);
        bob.giveQuiz();

        Student maia = new Student("Maia",002,25);
        maia.takeQuiz();
    }

}
