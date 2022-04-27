package com.practice.creational.factory.product;

public class WindowsButton implements Button {

  @Override
  public void render() {
    System.out.println("RENDER WINDOW button");

  }

  @Override
  public void onClick() {
    System.out.println("ClICKING WINDOW button");
  }

}
