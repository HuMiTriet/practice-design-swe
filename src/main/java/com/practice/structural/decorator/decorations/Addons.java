package com.practice.structural.decorator.decorations;

import com.practice.structural.decorator.Food;

public abstract class Addons implements Food {
  private Food wrappee;

  public Addons(Food wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public void describe() {
    wrappee.describe();
  }

  @Override
  public double getCost() {
    return wrappee.getCost();
  }

}
