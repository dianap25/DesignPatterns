package com.example.mycompan.visitor;

public class AreaCalculator implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Circle area = " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.height * rectangle.width;
        System.out.println("Rectangle area = " + area);
    }
}
