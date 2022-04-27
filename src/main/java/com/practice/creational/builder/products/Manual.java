package com.practice.creational.builder.products;

public class Manual {
  private String seatsType;
  private int engineVersion;

  @Override
  public String toString() {
    return "Manual of car with seattype: " + seatsType
        + " ,the enginve version is " + engineVersion;
  }

  public String getSeatsType() {
    return seatsType;
  }

  public void setSeatsType(String seatsType) {
    this.seatsType = seatsType;
  }

  public int getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(int engineVersion) {
    this.engineVersion = engineVersion;
  }

}
