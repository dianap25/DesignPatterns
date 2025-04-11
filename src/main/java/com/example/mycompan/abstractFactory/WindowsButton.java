package com.example.mycompan.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint WindowsButton");
    }
}
