package com.example.mycompan.prototype;

public class Circle implements Prototype {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //copy constructor
    public Circle(Circle circle) {
        this(circle.x, circle.y, circle.radius);
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }
    public void draw(){
        System.out.println("Radius:" + radius + ",x:" + x + ",y:" + y);
    }
}
