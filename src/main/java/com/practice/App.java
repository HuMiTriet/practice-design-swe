package com.practice;

import com.practice.structural.decorator.ClientDecorator;

//use the bridge design pattern when your application is scalling in two
//orthogonal axis and you don't want an explosion of subclasses
public class App {
  public static void main(String[] args) {
    ClientDecorator.execute();
  }
}
