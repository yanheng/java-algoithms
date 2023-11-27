package com.think.in.java.chapter07.example04.demo02;

public class Circle extends Shape{
  Circle(int i) {
    super(i);
    System.out.println("Drawing Circle");
  }

  @Override
  void dispose() {
    System.out.println("Erasing Circle");
    super.dispose();
  }
}
