package com.practice.behaviorial.visitor.elements;

import com.practice.behaviorial.visitor.visitors.Visitor;

public interface Shape {
  void accept(Visitor visitor);
}
