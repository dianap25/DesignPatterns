package com.example.mycompan.abstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Windows Checkbox");
    }
}
