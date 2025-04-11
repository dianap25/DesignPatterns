package com.example.mycompan.multipleDispatch;

public class Warrior extends Character{
    @Override
    public void attack(Character opponent) {
        opponent.receiveAttackFrom(this);
    }

    @Override
    public void receiveAttackFrom(Warrior warrior) {
        System.out.println("Warrior vs Warrior");

    }

    @Override
    public void receiveAttackFrom(Mage mage) {
        System.out.println("Warrior vs Mage");
    }
}
