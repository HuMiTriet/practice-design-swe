package com.practice.structural.bridge.abstraction;

import com.practice.structural.bridge.implementation.Color;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
abstract class Shape {
  protected Color color = null;

  public abstract void draw();
}
