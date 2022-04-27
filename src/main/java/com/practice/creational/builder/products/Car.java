package com.practice.creational.builder.products;

public class Car {
  private int seats = 0;
  private String engine;

  @Override
  public String toString() {
    return "Car with: " + seats + " seat(s), Engine V" + engine;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
