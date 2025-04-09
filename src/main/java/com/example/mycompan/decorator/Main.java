package com.example.mycompan.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " - " + coffee.cost());

        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " - " + coffee.cost());
    }
}
