package com.example.mycompan.visitor;

import java.awt.*;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
