package com.practice.structural.adapter.existing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoundHole {
  private int radius;

  public boolean fits(RoundPeg roundPeg) {
    return this.radius > roundPeg.getRadius();
  }

}
