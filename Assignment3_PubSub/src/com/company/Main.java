package com.company;

public class Main {

    public static void main(String[] args) {
	SeattlePoliceDepartment spd = new SeattlePoliceDepartment();
	Person p1 = new Person("Ada",21);
	Person p2 = new Person("Bob",25);
	Person p3 = new Person("Coco",16);
	Person p4 = new Person("David",46);

	p1.subscribe(spd);
	p2.subscribe(spd);
	p3.subscribe(spd);
	spd.NotifyCitizen("This Friday is not open for public.");

	p1.unSubscribe(spd);
	p3.unSubscribe(spd);
	p4.subscribe(spd);
	spd.NotifyCitizen("Next Monday is open for public.");
    }


}
