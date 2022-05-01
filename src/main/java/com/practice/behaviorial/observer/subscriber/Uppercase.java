package com.practice.behaviorial.observer.subscriber;

import com.practice.behaviorial.observer.Publisher;

public class Uppercase implements Subscriber {

  @Override
  public void update(Publisher publisher) {
    System.out.println("#" + publisher.getIndex() + " "
        + publisher.getState().toUpperCase());
  }

}
