package com.think.in.java.chapter08.example01.demo02;

import java.util.Random;

public class RandomShapeGenerator {
  private Random random = new Random(47);

  public Shape next() {
    switch (random.nextInt(3)) {
      default:
      case 0:
        return new Circle();
      case 1:
        return new Square();
      case 2:
        return new Triangle();
    }
  }
}
