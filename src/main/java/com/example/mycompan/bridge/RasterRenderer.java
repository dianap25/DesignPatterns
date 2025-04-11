package com.example.mycompan.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Draw  raster circle: radius = " + radius);
    }
}
