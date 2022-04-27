package com.practice.creational.builder;

import com.practice.creational.builder.builders.CarBuilder;
import com.practice.creational.builder.builders.ManualBuilder;
import com.practice.creational.builder.products.Car;
import com.practice.creational.builder.products.Manual;

public class ClientBuilder {
  public static void execute() {

    CarBuilder carBuilder = new CarBuilder();

    carBuilder.setSeat(4);

    carBuilder.setEngine("6");

    Car productCar = carBuilder.getProduct();

    System.out.println(productCar.toString());

    ManualBuilder manualBuilder = new ManualBuilder();

    manualBuilder.setSeat(4);

    manualBuilder.setEngine("6");

    Manual productManual = manualBuilder.getProduct();

    System.out.println(productManual.toString());

  }
}
