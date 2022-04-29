package com.practice.creational.prototype.prototypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// base prototype
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Shape {
  private int x;
  private int y;
  private String color;

  // prototype constructor
  public Shape(Shape source) {
    this.x = source.x;
    this.y = source.y;
    this.color = source.color;
  }

  public abstract Shape clone();

}
