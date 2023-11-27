package com.think.in.java.chapter08.example01.demo03;

public class PrivateOverride {
  private void f() {
    System.out.println("private f()");
  }

  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}
