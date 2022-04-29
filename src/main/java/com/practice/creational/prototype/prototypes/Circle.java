package com.practice.creational.prototype.prototypes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Circle extends Shape {

  private int radius;

  // Normal constructor should only be run once to create the inital object, that
  // every other instance is cloned from!!
  public Circle() {
    super();
    System.out.println("CIRCLE NEW OBJECT");
  }

  public Circle(Circle source) {
    super(source);
    this.radius = source.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

}
