package com.company.Q3;

public class Shape {
    public String name;
    public String color;
    public double area;
    public double perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){
        return "[Name : " + getName() +"] [Color : " + getColor() + "] [Area : " + getArea() + "] [Perimeter : " + getPerimeter();
    }
    public void display(){
        System.out.println("************");
        System.out.println("shape : " + getName());
        System.out.println("Perimeter : " + getPerimeter());
        System.out.println("Area : " + getArea());
    }
}
