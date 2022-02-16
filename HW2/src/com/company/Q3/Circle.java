package com.company.Q3;

import com.company.Q2.Shape;

public class Circle extends Shape {
    double radius;
    final float PI=3.14f;

    public Circle(double radius) {
        super("Circle", "Color");
        this.radius = radius;
    }

    public Circle(){
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea(){
        System.out.println("The area for rectangle is " +  getArea());
    }

    public void computePerimeter(){
        System.out.println("The perimeter for rectangle is " + getPerimeter() );
    }
    @Override
    public double getArea(){
        return getRadius() * getRadius() * PI;
    }
    @Override
    public double getPerimeter(){
        return getRadius() * 2 * PI;
    }
}
