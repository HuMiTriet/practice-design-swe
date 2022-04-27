package com.practice.creational.factory.creator;

import com.practice.creational.factory.product.Button;
import com.practice.creational.factory.product.WindowsButton;

public class WindowsDialog extends Dialog {

  @Override
  Button createButton() {
    return new WindowsButton();
  }
}
