package com.example.mycompan.bridge;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle1 = new Circle(vector, 5);
        Shape circle2 = new Circle(raster, 10);

        circle1.draw();
        circle2.draw();
    }
}
