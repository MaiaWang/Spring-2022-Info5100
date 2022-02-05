package com.company;

public class Main {

    public static void main(String[] args) {
    	Department software = new Department("software", 1);
    	Employee people = new Employee();
	 	Employee maia = new Employee("maia", 8, software);
	 	Employee ting = new Employee("ting", 9);

	 	Employee e = new Employee(maia);


	 	maia.printEmployeeInfo();
	 	ting.printEmployeeInfo();

		 Employee mac = maia;
	 	mac.printEmployeeInfo();

		 mac.setName("mac");
		 mac.printEmployeeInfo();

	 	people.printEmployeeInfo();

		System.out.println(e.getDept().getDeptName());


    }
}
