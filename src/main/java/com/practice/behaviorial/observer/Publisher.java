package com.practice.behaviorial.observer;

import java.util.ArrayList;
import java.util.Scanner;

import com.practice.behaviorial.observer.subscriber.Subscriber;

import lombok.Getter;
import lombok.Setter;

public class Publisher {
  private @Getter @Setter String state;
  private @Getter @Setter int index;

  private ArrayList<Subscriber> subscribers = new ArrayList<>();

  public void subcribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  public void unsubscrive(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void notifySubscriber() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter sth: (press quit to quit) ");

    while (scanner.hasNextLine()) {
      index++;
      state = scanner.nextLine();

      if (state.equalsIgnoreCase("quit")) {
        scanner.close();
        break;
      }

      for (Subscriber subscriber : subscribers) {
        subscriber.update(this);
      }

    }

  }

}
