package com.practice.creational.prototype.prototypes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Rectangle extends Shape {

  private int width;
  private int height;

  // Normal constructor should only be run once to create the inital object, that
  // every other instance is cloned from!!
  public Rectangle() {
    super();
    System.out.println("RECTANGLE NEW OBJECT");
  }

  public Rectangle(Rectangle source) {

    // a parent constructor call is need to copy private fields defined in the
    // parent class
    super(source);

    // the new fields defined in Rectangle is then copied
    this.width = source.width;
    this.height = source.height;
  }

  @Override
  public Shape clone() {
    // Copy itself
    return new Rectangle(this);
  }

}
