package com.practice.structural.bridge.abstraction;

import com.practice.structural.bridge.implementation.Color;

import lombok.Setter;

@Setter
public class Circle extends Shape {

  private double radius = 0.0;

  public Circle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a " + color.getName() +
        " CIRLCE with " + radius + " radius");
  }

}
