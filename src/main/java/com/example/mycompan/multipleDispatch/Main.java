package com.example.mycompan.multipleDispatch;

public class Main {
    public static void main(String[] args) {
        Character w1 = new Warrior();
        Character m1 = new Mage();

        w1.attack(m1);
        m1.attack(w1);
    }
}
