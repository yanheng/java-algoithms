package com.think.in.java.chapter08.example01.demo02;

public class Shapes {

  private static RandomShapeGenerator generator = new RandomShapeGenerator();

  public static void main(String[] args) {
    Shape[] s = new Shape[9];

    for (int i = 0; i < s.length; i++) {
      s[i] = generator.next();
    }

    for (Shape shape : s) {
      shape.draw();
      shape.color();
    }
  }

}
