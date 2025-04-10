package com.example.mycompan.scalableFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ScalableShapeFactory {
    private Map<String, Supplier<Shape>> registry = new HashMap<>();
    public void registerShape(String name, Supplier<Shape> supplier) {
        registry.put(name.toLowerCase(), supplier);
    }
    public Shape createShape(String name) {
        Supplier<Shape> supplier = registry.get(name.toLowerCase());
        return supplier.get();
    }
}
