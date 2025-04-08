package com.example.mycompan.observer;

public class CurrentConditionsDisplay implements Observer{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature: " + temperature + "°C, humidity: " + humidity + "%");
    }
}
