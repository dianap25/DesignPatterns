package com.example.mycompan.prototypeFactory;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();
        factory.register("a", new ConcreteProductA());
        factory.register("b", new ConcreteProductB());
        Product p1 = factory.create("a");
        Product p2 = factory.create("b");

        p1.use();
        p2.use();
    }
}
