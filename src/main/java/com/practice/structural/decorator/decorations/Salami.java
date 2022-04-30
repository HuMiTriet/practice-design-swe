package com.practice.structural.decorator.decorations;

import com.practice.structural.decorator.Food;

public class Salami extends Addons {

  public Salami(Food wrappee) {
    super(wrappee);
  }

  @Override
  public void describe() {
    super.describe();
    System.out.println("- Salami");
  }

  @Override
  public double getCost() {
    return super.getCost() + 5;
  }

}
