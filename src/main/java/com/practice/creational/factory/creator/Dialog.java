package com.practice.creational.factory.creator;

import com.practice.creational.factory.product.Button;

// this is the creator class that has a factory method that return an object of
// the product class.
public abstract class Dialog {

  abstract Button createButton();

  // Despite this class dialog being a creator class its main responsibilty is
  // not to just create buttons (products). It usually contain some business logic
  // that relies on the product object returned by the factory method.
  public void render() {

    // create the button (product)
    Button button = createButton();

    // using the product
    button.render();
    button.onClick();

  }

}
