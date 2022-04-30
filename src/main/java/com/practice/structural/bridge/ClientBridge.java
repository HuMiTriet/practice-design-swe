package com.practice.structural.bridge;

import com.practice.structural.bridge.abstraction.Circle;
import com.practice.structural.bridge.abstraction.Rectangle;
import com.practice.structural.bridge.implementation.Blue;
import com.practice.structural.bridge.implementation.Red;

// The client is only interested with working with the bridge concrete classes
// and never with the implementation. but it's the client job to link the
// abstraction class to the implementation
public class ClientBridge {
  public static void execute() {
    Red red = new Red();

    // Client link the concrete abstraction class to the implementaion
    Circle circle = new Circle(red);
    circle.setRadius(2);

    circle.draw();

    Blue blue = new Blue();

    circle.setColor(blue);

    circle.draw();

    Rectangle rectangle = new Rectangle(red);

    rectangle.draw();

  }
}
