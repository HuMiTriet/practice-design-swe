package com.practice.behaviorial.visitor.elements;

import com.practice.behaviorial.visitor.visitors.Visitor;

public class Circle implements Shape {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitCircle(this);
  }

}
