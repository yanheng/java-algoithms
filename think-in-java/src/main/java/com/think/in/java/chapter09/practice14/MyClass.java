package com.think.in.java.chapter09.practice14;

public class MyClass {
  static void f1(IOne one) {
    one.a();
    one.b();
  }

  static void f2(ITwo two) {
    two.c();
    two.d();
  }

  static void f3(IThree three) {
    three.e();
    three.f();
  }

  static void f4(ISub sub) {
    sub.a();
    sub.b();
    sub.d();
    sub.g();
  }

  public static void main(String[] args) {
    SubClass subClass = new SubClass();
    f1(subClass);
    f2(subClass);
    f3(subClass);
    f4(subClass);
  }
}
