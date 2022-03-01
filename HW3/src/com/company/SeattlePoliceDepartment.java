package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> people;
    String notification;

    public SeattlePoliceDepartment() {
        this.people = new ArrayList<Person>();
    }

    public void NotifyCitizen(String notification){
        this.notification = notification;
        for(Person s : people){
            s.getNotification(this);
        }
    }
}
