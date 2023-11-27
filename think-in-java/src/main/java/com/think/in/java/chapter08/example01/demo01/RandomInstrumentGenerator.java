package com.think.in.java.chapter08.example01.demo01;

import java.util.Random;

public class RandomInstrumentGenerator {

  private Random random = new Random(47);

  public Instrument next() {
    switch (random.nextInt(5)) {
      default:
      case 0:
        return new Brass();
      case 1:
        return new Percussion();
      case 2:
        return new Stringed();
      case 3:
        return new Wind();
      case 4:
        return new Woodwind();
    }
  }
}
