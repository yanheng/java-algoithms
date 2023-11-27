package com.think.in.java.chapter07.example08.demo04;

public class OverridingPrivate extends WithFinals {

  private final void f() {
    System.out.println("OverridingPrivate.f()");
  }

  private void g() {
    System.out.println("OverridingPrivate.g()");
  }
}
