package com.company.Q3;

import com.company.Q2.Shape;

public class ShapeTester {
    public static void main(String args[]){
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);

        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}
