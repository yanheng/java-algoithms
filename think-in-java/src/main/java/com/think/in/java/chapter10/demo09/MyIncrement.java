package com.think.in.java.chapter10.demo09;

public class MyIncrement {
  public void increment() {
    System.out.println("Other operation");
  }

  static void f(MyIncrement mi) {
    mi.increment();
  }
}
