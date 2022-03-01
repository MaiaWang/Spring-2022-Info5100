package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd){
        if(!spd.people.contains(this)){
            spd.people.add(this);
        }
    }

    public void unSubscribe(SeattlePoliceDepartment spd){
        spd.people.remove(this);
    }

    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println("------------");
        System.out.println("Person name : " + this.name + " | age : " + this.age);
        System.out.println("Notification from Seattle Police Department : " + spd.notification);
    }
}
