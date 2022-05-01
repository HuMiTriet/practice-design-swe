package com.practice.behaviorial.observer.subscriber;

import com.practice.behaviorial.observer.Publisher;

public interface Subscriber {
  void update(Publisher publisher);
}
