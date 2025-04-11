package com.example.mycompan.singleton;

public class SingletonThreadsSafe {
    private SingletonThreadsSafe() {}

    private static class Holder{
        private static final SingletonThreadsSafe INSTANCE = new SingletonThreadsSafe();
    }
    public static SingletonThreadsSafe getInstance(){
        return Holder.INSTANCE;
    }
}
