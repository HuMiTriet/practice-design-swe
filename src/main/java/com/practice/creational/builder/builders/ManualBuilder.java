package com.practice.creational.builder.builders;

import com.practice.creational.builder.products.Manual;

public class ManualBuilder implements Builder {

  private Manual manual;

  public ManualBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeat(int seats) {
    manual.setSeatsType("#No of seats: " + Integer.toString(seats));
  }

  @Override
  public void setEngine(String name) {
    manual.setEngineVersion(Integer.parseInt(name));
  }

  public Manual getProduct() {
    Manual result = manual;

    this.reset();

    return result;
  }

}
