package com.example.mycompan.scalableFactory;

public class Main {
    public static void main(String[] args) {
        ScalableShapeFactory factory = new ScalableShapeFactory();

        factory.registerShape("circle", Circle::new);
        factory.registerShape("square", Square::new);
        Shape shape1 = factory.createShape("circle");
        Shape shape2 = factory.createShape("square");

        shape1.draw();
        shape2.draw();

    }
}
