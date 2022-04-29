package com.practice.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import com.practice.creational.prototype.prototypes.Shape;

public class Registry {
  private static Map<String, Shape> cache;

  public Registry() {
    cache = new HashMap<>();
  }

  public void add(String type, Shape shape) {
    cache.put(type, shape);
  }

  public Shape searchByKey(String key) {
    return cache.get(key).clone();
  }
}
