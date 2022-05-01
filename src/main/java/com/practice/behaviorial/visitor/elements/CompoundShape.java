package com.practice.behaviorial.visitor.elements;

import java.util.ArrayList;

import com.practice.behaviorial.visitor.visitors.Visitor;

public class CompoundShape implements Shape {
  public ArrayList<Shape> elements = new ArrayList<>();

  @Override
  public void accept(Visitor visitor) {
    visitor.visitCompoundShape(this);
  }

}
