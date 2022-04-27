package com.practice.creational.factory.creator;

import com.practice.creational.factory.product.Button;
import com.practice.creational.factory.product.WebButton;

public class WebDialog extends Dialog {

  @Override
  Button createButton() {
    return new WebButton();
  }
}
