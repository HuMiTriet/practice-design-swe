package com.practice.creational.prototype;

import com.practice.creational.prototype.prototypes.Circle;
import com.practice.creational.prototype.prototypes.Rectangle;

public class ClientPrototype {
  public static void execute() {

    Circle circle = new Circle();
    circle.setColor("red");
    circle.setX(1);
    circle.setY(1);
    circle.setRadius(2);

    Rectangle rectangle = new Rectangle();
    rectangle.setColor("black");
    rectangle.setX(2);
    rectangle.setY(2);
    rectangle.setWidth(3);
    rectangle.setHeight(4);

    Registry registry = new Registry();
    registry.add("circle", circle);
    registry.add("rectangle", rectangle);

    Circle test = (Circle) registry.searchByKey("circle");

    System.out.println(test.getColor());
    System.out.println(test.getX());
    System.out.println(test.getY());
    System.out.println(test.getRadius());
  }
}
