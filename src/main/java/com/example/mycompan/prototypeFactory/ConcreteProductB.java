package com.example.mycompan.prototypeFactory;

public class ConcreteProductB implements Product{

    @Override
    public Product clone() {
        return new ConcreteProductB();
    }

    @Override
    public void use() {
        System.out.println("ConcreteProductB use");
    }
}
