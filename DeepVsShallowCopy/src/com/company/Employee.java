package com.company;

public class Employee {
    private String name;
    private int id;
    private Department dept;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;

    }

    public Employee(){
        name = "Sample";
        id = 0;
        dept = null;
    }

    public Employee(Employee employee){
        this.name = employee.name;
        this.id = employee.id;
        this.dept = new Department("Sample Dept", 1);

    }

    public Employee(String name, int id, Department dept){
        this.name = name;
        this.id = id;
        this.dept = dept;

    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printEmployeeInfo(){
        System.out.println("***************");
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.id);
    }
}

