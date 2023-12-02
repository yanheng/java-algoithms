package com.think.in.java.chapter09.practice03;

public class Sub extends Base {

  private int x = 5;

  @Override
  void print() {
    System.out.println("x = " + x);
  }

  public static void main(String[] args) {
    Sub sub = new Sub();
    sub.print();
  }
}
