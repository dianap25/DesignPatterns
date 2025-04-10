package com.example.mycompan.prototypeFactory;

public class ConcreteProductA implements Product{
    @Override
    public Product clone() {
        return new ConcreteProductA();
    }

    @Override
    public void use() {
        System.out.println("ConcreteProductA.use");
    }
}
