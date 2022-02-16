package com.company.Q3;

import com.company.Q2.Shape;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        super("Rectangle", "Color");
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        super();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void computeArea(){
        System.out.println("The area for rectangle is " + getArea());
    }

    public void computePerimeter(){
        System.out.println("The perimeter for rectangle is " + getPerimeter() );
    }
    @Override
    public double getArea(){
        return getLength()* getWidth();
    }
    @Override
    public double getPerimeter(){
        return (getLength() + getWidth())*2;
    }
}
