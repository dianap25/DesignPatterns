package com.example.mycompan.prototypeFactory;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<String, Product> prototypes = new HashMap<>();
    public void register(String name, Product prototype) {
        prototypes.put(name, prototype);
    }
    public Product create(String name) {
        Product prototype = prototypes.get(name);
        return prototype.clone();
    }
}
