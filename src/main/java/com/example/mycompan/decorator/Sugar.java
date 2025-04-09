package com.example.mycompan.decorator;

public class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
