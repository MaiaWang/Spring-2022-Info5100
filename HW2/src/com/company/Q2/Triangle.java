package com.company.Q2;

import com.company.Q2.Shape;

public class Triangle extends Shape {
    double base;
    double height;


    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, double side) {
        super(name, color);
        this.base = side;
        this.height = side * Math.sqrt(3)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter(){
        return base * 2 + Math.sqrt(Math.pow(base / 2, 2) +Math.pow(height, 2)) * 2;
    }

    @Override
    public double getArea(){
        return base * height / 2;
    }
}
