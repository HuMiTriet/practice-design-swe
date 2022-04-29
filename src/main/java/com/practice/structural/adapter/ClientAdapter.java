package com.practice.structural.adapter;

import com.practice.structural.adapter.addons.SquarePeg;
import com.practice.structural.adapter.existing.RoundHole;
import com.practice.structural.adapter.existing.RoundPeg;

public class ClientAdapter {

  public static void execute() {

    RoundPeg roundPeg = new RoundPeg(2);
    RoundHole roundHole = new RoundHole(5);

    // fiting round peg into roung holes nothing special
    System.out.println(roundHole.fits(roundPeg));

    SquarePeg squarePeg = new SquarePeg(5);

    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

    System.out.println(squarePegAdapter.getRadius());

    System.out.println(roundHole.fits(squarePegAdapter));
  }

}
