package com.think.in.java.chapter10.practice01;

public class Outer {

  private String str;

  public Outer(String str) {
    this.str = str;
  }

  class Inner {
    @Override
    public String toString() {
      return str;
    }
  }

  public Inner getInner() {
    return new Inner();
  }

  public static void main(String[] args) {
    Outer.Inner i = new Outer("Hello world").getInner();
    System.out.println(i);


  }
}
