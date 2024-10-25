package com.think.in.java.chapter10.demo09;

public class Callee1 implements Incrementable {
  private int i = 0;

  @Override
  public void increment() {
    i++;
    System.out.println("Callee1 " + i);
  }
}
