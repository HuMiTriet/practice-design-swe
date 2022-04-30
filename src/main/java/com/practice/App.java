package com.practice;

import com.practice.structural.bridge.ClientBridge;

//use the bridge design pattern when your application is scalling in two
//orthogonal axis and you don't want an explosion of subclasses
public class App {
  public static void main(String[] args) {
    ClientBridge.execute();
  }
}
