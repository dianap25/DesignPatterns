package com.example.mycompan.proxy;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;
    private String password;

    public DocumentProxy(String fileName, String password) {
        this.fileName = fileName;
        this.password = password;
    }

    @Override
    public void display() {
        if(checkAccess()){
            if(realDocument == null){
                realDocument = new RealDocument(fileName);
            }
            realDocument.display();
        }else{
            System.out.println("Access denied");
        }
    }

    private boolean checkAccess() {
        return "admin".equals(password);
    }
}
