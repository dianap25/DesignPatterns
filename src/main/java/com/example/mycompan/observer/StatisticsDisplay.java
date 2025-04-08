package com.example.mycompan.observer;

public class StatisticsDisplay implements Observer {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics: temperature = " + temperature + ", humidity = "
                + humidity + ", pressure = " + pressure);
    }
}
