package com.practice.structural.adapter.existing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoundHole {
  private int radius;

  public boolean fits(RoundPeg roundPeg) {

    if (this.radius > roundPeg.getRadius())
      return true;
    else
      return false;
  }

}
