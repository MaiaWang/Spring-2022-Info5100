package com.company;

public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(){
        name = "Sample Student";
        id = 0;
        gpa = 0.0;
    }

    public Student(Student student){
        Student s = new Student();
        this.name = student.name;
        this.id = student.id;
        this.gpa = student.gpa;
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printDetails(){
        System.out.println("Student name : " + this.name + " Student id : " + this.id + " have a gap of "+this.gpa );
    }
}
