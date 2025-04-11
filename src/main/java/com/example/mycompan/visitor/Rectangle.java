package com.example.mycompan.visitor;

public class Rectangle implements Shape {
    public int width = 10;
    public int height = 20;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
