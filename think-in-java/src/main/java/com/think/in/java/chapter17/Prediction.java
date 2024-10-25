package com.think.in.java.chapter17;

import java.util.Random;

public class Prediction {
  private static Random random = new Random(47);

  private boolean shadow = random.nextDouble() > 0.5;


  @Override
  public String toString() {
    if (shadow) {
      return "Six more weeks of Winter";
    } else {
      return "Early Spring";
    }
  }
}
