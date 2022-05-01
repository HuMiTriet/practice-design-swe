package com.practice.behaviorial.observer;

import com.practice.behaviorial.observer.subscriber.Number;
import com.practice.behaviorial.observer.subscriber.Subscriber;
import com.practice.behaviorial.observer.subscriber.Uppercase;

public class ClientObserver {
  public static void execute() {
    Publisher publisher = new Publisher();

    Subscriber upper = new Uppercase();
    Subscriber numb = new Number();

    publisher.subcribe(upper);
    publisher.subcribe(numb);

    publisher.notifySubscriber();

  }
}
