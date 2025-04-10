package com.example.mycompan.prototypeFactory;

public interface Product extends Cloneable{
    Product clone();
    void use();
}
