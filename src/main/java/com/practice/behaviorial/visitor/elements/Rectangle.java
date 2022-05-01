package com.practice.behaviorial.visitor.elements;

import com.practice.behaviorial.visitor.visitors.Visitor;

public class Rectangle implements Shape {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitRectangle(this);

  }

}
