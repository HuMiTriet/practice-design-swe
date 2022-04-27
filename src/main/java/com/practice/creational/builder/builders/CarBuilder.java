package com.practice.creational.builder.builders;

import com.practice.creational.builder.products.Car;

public class CarBuilder implements Builder {

  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeat(int seats) {
    car.setSeats(seats);
  }

  @Override
  public void setEngine(String name) {
    car.setEngine(name);
  }

  // because the builder design pattern can create products that are totaly
  // unrelated to each other therefore the getProduct method is declare in here
  public Car getProduct() {
    Car result = car;

    // Because often after the bulder design pattern return a result it's expected
    // to continute producing a new product ⇒ run reset.
    this.reset();
    // However this behavior is not mandatory to the design pattern

    return result;
  }

}
