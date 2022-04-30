package com.practice.structural.composite;

import com.practice.structural.composite.box.Box;
import com.practice.structural.composite.items.Pant;
import com.practice.structural.composite.items.Shirt;

public class ClientComposite {
  public static void execute() {

    Shirt shirt1 = new Shirt(); // 40
    Pant pant1 = new Pant(); // 30
    Box box1 = new Box(); // 40 + 30 + 40

    Shirt shirt2 = new Shirt(); // 40
    Box box2 = new Box(); // 40

    box2.addItem(shirt2);

    box1.addItem(box2);
    box1.addItem(shirt1);
    box1.addItem(pant1);

    System.out.println("The total price is: " + box1.sum());
  }
}
