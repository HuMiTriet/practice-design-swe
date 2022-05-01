package com.practice.structural.decorator;

import com.practice.structural.decorator.Base.ThickBase;
import com.practice.structural.decorator.Base.ThinBase;
import com.practice.structural.decorator.decorations.Addons;
import com.practice.structural.decorator.decorations.Cheese;
import com.practice.structural.decorator.decorations.Salami;

public class ClientDecorator {

  public static void execute() {

    ThinBase thinBase = new ThinBase();

    Addons thinCheese = new Cheese(thinBase);

    Addons thinCheeseSalami = new Salami(thinCheese);

    thinCheeseSalami.describe();

    System.out.println("The total price is: " + thinCheeseSalami.getCost());

    Food thickCheeseSalami = new Salami(
        new Cheese(
            new ThickBase()));

    thickCheeseSalami.describe();

    System.out.println("The total price is: " + thickCheeseSalami.getCost());
  }

}
