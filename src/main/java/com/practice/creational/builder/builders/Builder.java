package com.practice.creational.builder.builders;

interface Builder {
  void reset();

  void setSeat(int seats);

  void setEngine(String name);

}
