package com.think.in.java.chapter10.practice10;

public class A {

  public U x() {
    return new U() {
      @Override
      public void f1() {
        System.out.println("A f1()");
      }

      @Override
      public void f2() {
        System.out.println("A f2()");
      }

      @Override
      public void f3() {
        System.out.println("A f3()");
      }
    };
  }
}
