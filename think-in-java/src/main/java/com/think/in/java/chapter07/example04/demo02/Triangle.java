package com.think.in.java.chapter07.example04.demo02;

public class Triangle extends Shape{
  Triangle(int i) {
    super(i);
    System.out.println("Drawing Triangle");
  }

  @Override
  void dispose() {
    System.out.println("Erasing Triangle");
    super.dispose();
  }
}
