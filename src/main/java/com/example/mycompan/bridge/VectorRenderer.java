package com.example.mycompan.bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Draw vector circle: radius = " + radius);
    }
}
