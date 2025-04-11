package com.example.mycompan.visitor;

public class Circle implements Shape {
    public int radius = 5;
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
