package com.practice.structural.facade.subsystems;

public abstract class Codec {
  public String type = "";

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
