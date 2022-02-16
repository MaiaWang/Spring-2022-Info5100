package com.company.Q1;

public class Student {
    public int rollNumber;
    public String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student s){
        this.rollNumber = s.rollNumber;
        this.name = s.name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        name = name;
    }

    public int printRoll(){
        return getRollNumber();
    }

    public String printName(){
        return getName();
    }
}
