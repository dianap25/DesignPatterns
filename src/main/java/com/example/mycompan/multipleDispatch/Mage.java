package com.example.mycompan.multipleDispatch;

public class Mage extends Character{
    @Override
    public void attack(Character opponent) {
        opponent.receiveAttackFrom(this);
    }

    @Override
    public void receiveAttackFrom(Warrior warrior) {
        System.out.println("Mage vs Warrior");
    }

    @Override
    public void receiveAttackFrom(Mage mage) {
        System.out.println("Mage vs Mage");
    }
}
