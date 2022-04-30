package com.practice.structural.decorator.decorations;

import com.practice.structural.decorator.Food;

public class Cheese extends Addons {

  public Cheese(Food wrappee) {
    super(wrappee);
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("- Cheese");
  }

  @Override
  public double getCost() {
    return super.getCost() + 5;
  }

}
