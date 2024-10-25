package com.think.in.java.chapter10.demo09;

public class Caller {
  private Incrementable callbackReference;

  Caller(Incrementable cbh) {
    callbackReference = cbh;
  }

  void go() {
    callbackReference.increment();
  }
}
