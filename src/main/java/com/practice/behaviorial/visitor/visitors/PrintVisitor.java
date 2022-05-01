package com.practice.behaviorial.visitor.visitors;

import com.practice.behaviorial.visitor.elements.Circle;
import com.practice.behaviorial.visitor.elements.CompoundShape;
import com.practice.behaviorial.visitor.elements.Dot;
import com.practice.behaviorial.visitor.elements.Rectangle;
import com.practice.behaviorial.visitor.elements.Shape;

public class PrintVisitor implements Visitor {

  private Class getName(Shape shape) {
    return shape.getClass();
  }

  @Override
  public void visitCircle(Circle circle) {
    System.out.println(getName(circle));
  }

  @Override
  public void visitDot(Dot dot) {
    System.out.println(getName(dot));
  }

  @Override
  public void visitCompoundShape(CompoundShape compoundShape) {

    System.out.println(getName(compoundShape));

    for (Shape element : compoundShape.elements) {
      element.accept(this);
    }
  }

  @Override
  public void visitRectangle(Rectangle rectangle) {
    System.out.println(getName(rectangle));
  }

}
