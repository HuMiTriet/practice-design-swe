package com.practice.behaviorial.visitor;

import com.practice.behaviorial.visitor.elements.Circle;
import com.practice.behaviorial.visitor.elements.CompoundShape;
import com.practice.behaviorial.visitor.elements.Dot;
import com.practice.behaviorial.visitor.elements.Rectangle;
import com.practice.behaviorial.visitor.visitors.PrintVisitor;

public class ClientVisitor {
  public static void execute() {
    Circle circle = new Circle();

    CompoundShape compoundShape = new CompoundShape();

    compoundShape.elements.add(circle);

    Dot dot = new Dot();

    Rectangle rectangle = new Rectangle();

    CompoundShape root = new CompoundShape();

    root.elements.add(rectangle);

    root.elements.add(dot);

    root.elements.add(compoundShape);

    PrintVisitor printVisitor = new PrintVisitor();

    root.accept(printVisitor);
  }
}
