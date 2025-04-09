package com.example.mycompan.prototype;

public class Main {
    public static void main(String[] args) {
        Circle original = new Circle(10, 20, 5);
        original.draw();

        Circle clone = (Circle) original.clone();
        clone.draw();
    }
}
