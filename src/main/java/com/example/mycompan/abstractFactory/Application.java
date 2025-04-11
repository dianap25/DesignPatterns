package com.example.mycompan.abstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }
    public void render(){
        button.paint();
        checkbox.paint();
    }
}
