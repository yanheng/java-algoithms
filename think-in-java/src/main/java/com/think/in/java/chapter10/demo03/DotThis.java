package com.think.in.java.chapter10.demo03;

public class DotThis {
  void f() {
    System.out.println("DotThis.f()");
  }

  public class Inner {
    public DotThis outer() {
      return DotThis.this;
    }
  }

  public Inner inner() {
    return new Inner();
  }

  public static void main(String[] args) {
    DotThis dotThis = new DotThis();
    DotThis.Inner inner = dotThis.new Inner();
  }
}
