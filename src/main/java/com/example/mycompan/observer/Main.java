package com.example.mycompan.observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay = new CurrentConditionsDisplay();
        Observer statsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statsDisplay);

        weatherData.setMeasurements(22.5f,65.0f,1012.1f);
        weatherData.setMeasurements(24.5f,60.0f,1013.1f);
    }
}
