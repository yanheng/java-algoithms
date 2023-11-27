package com.think.in.java.chapter08.example01.demo02;

public class Triangle extends Shape{

  @Override
  public void draw() {
    System.out.println("Triangle.draw()");
  }

  @Override
  public void erase() {
    System.out.println("Triangle.erase()");
  }

  @Override
  public void color() {
    System.out.println("Triangle.color");
  }
}
