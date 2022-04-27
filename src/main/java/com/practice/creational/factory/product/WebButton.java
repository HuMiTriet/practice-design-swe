package com.practice.creational.factory.product;

public class WebButton implements Button {

  @Override
  public void render() {
    System.out.println("RENDER WEB button");

  }

  @Override
  public void onClick() {
    System.out.println("CLICKING WEB button");
  }

}
