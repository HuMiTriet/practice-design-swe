package com.practice.behaviorial.visitor.visitors;

import com.practice.behaviorial.visitor.elements.Circle;
import com.practice.behaviorial.visitor.elements.CompoundShape;
import com.practice.behaviorial.visitor.elements.Dot;
import com.practice.behaviorial.visitor.elements.Rectangle;

public interface Visitor {

  void visitCircle(Circle circle);

  void visitDot(Dot dot);

  void visitCompoundShape(CompoundShape compoundShape);

  void visitRectangle(Rectangle rectangle);

}
