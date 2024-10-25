package com.think.in.java.chapter10.practice01;

public class OuterTest {
  public static void main(String[] args) {
    Outer outer = new Outer("hello");
    Outer.Inner inner = outer.new Inner();
  }
}
