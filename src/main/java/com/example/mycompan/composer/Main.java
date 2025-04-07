package com.example.mycompan.composer;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        Leaf leaf3 = new Leaf("Leaf3");
        Composite mainComposite = new Composite();
        mainComposite.add(composite);
        mainComposite.add(leaf3);
        mainComposite.operation();
    }
}
