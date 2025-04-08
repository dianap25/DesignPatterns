package com.example.mycompan.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightsOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightsOff);
        remoteControl.pressButton();
    }
}
