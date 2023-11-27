package com.think.in.java.chapter08.example01.demo08;

public class RectangularGlyph extends Glyph {

  private String name;

  RectangularGlyph(String name) {
    this.name = name;
    System.out.println("RectangularGlyph.RectangularGlyph() name = " + this.name);
  }

  @Override
  void draw() {
    System.out.println("RectangularGlyph.draw() name = " + this.name);
  }
}
