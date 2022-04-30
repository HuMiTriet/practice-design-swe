package com.practice.structural.decorator.Base;

import com.practice.structural.decorator.Food;

public class ThickBase implements Food {

  @Override
  public void describe() {
    System.out.println("This is a THICK pizza with: ");
  }

  @Override
  public double getCost() {
    return 15;
  }

}
