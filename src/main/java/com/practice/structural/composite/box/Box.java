package com.practice.structural.composite.box;

import java.util.ArrayList;

import com.practice.structural.composite.Item;

public class Box implements Item {
  ArrayList<Item> elements = new ArrayList<>();

  @Override
  public double sum() {
    double result = 0;

    for (Item item : elements) {
      result += item.sum();
    }

    return result;
  }

  public void addItem(Item item) {
    elements.add(item);
  }

}
