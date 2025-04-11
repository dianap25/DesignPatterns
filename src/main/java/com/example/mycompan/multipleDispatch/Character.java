package com.example.mycompan.multipleDispatch;

public abstract class Character {
    public abstract void attack(Character opponent);

    public abstract void receiveAttackFrom(Warrior warrior);
    public abstract void receiveAttackFrom(Mage mage);
}
