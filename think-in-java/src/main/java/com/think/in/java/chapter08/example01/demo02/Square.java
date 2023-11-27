package com.think.in.java.chapter08.example01.demo02;

public class Square extends Shape{

  @Override
  public void draw() {
    System.out.println("Square.draw()");
  }

  @Override
  public void erase() {
    System.out.println("Square.erase");
  }

  @Override
  public void color() {
    System.out.println("Square.color");
  }
}
