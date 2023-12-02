package com.think.in.java.chapter09.practice18;

public class BicycleFactory implements CycleFactory {
  @Override
  public Cycle getCycle() {
    return new Bicycle();
  }
}
