package com.example.mycompan.proxy;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new DocumentProxy("secret.pdf", "wrongpass");
        doc1.display();
        System.out.println();

        Document doc2 = new DocumentProxy("secret.pdf", "admin");
        doc2.display();
    }
}
