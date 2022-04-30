package com.practice.structural.decorator.Base;

import com.practice.structural.decorator.Food;

public class ThinBase implements Food {

  @Override
  public void describe() {
    System.out.println("This is a THIN pizza with: ");
  }

  @Override
  public double getCost() {
    return 10;
  }

}
