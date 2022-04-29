package com.practice.structural.adapter;

import com.practice.structural.adapter.addons.SquarePeg;
import com.practice.structural.adapter.existing.RoundPeg;

public class SquarePegAdapter extends RoundPeg {
  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public int getRadius() {
    return (int) Math.floor(squarePeg.getWidth() * Math.sqrt(2) / 2);
  }

}
