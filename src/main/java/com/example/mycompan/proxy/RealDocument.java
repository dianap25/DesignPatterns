package com.example.mycompan.proxy;

public class RealDocument implements Document {
    private String fileName;
    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading document: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("Display document: " + fileName);
    }
}
