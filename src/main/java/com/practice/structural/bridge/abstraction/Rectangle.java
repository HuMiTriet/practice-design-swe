package com.practice.structural.bridge.abstraction;

import com.practice.structural.bridge.implementation.Color;

import lombok.Setter;

@Setter
public class Rectangle extends Shape {

  private double width = 0.0;
  private double height = 0.0;

  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a " + color.getName() +
        " RECTANGLE with width" + width + " and height: " + height);
  }

}
