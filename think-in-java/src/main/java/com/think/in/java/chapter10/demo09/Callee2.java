package com.think.in.java.chapter10.demo09;

public class Callee2 extends MyIncrement {
  private int i = 0;

  public void increment() {
    super.increment();
    i++;
    System.out.println("Callee2 " + i);
  }

  private class Closure implements Incrementable {

    @Override
    public void increment() {
      Callee2.this.increment();
    }
  }

  Incrementable getCallbackReference() {
    return new Closure();
  }
}
