package com.think.in.java.chapter08.example01.demo08;

public class RoundGlyph extends Glyph {
  private int radius = 1;

  RoundGlyph(int i) {
    this.radius = i;
    System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
  }

  @Override
  void draw() {
    System.out.println("RoundGlyph.draw, radius = " + radius);
  }
}
