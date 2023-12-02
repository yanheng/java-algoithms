package com.think.in.java.chapter09.practice18;

public class TricycleFactory implements CycleFactory {
  @Override
  public Cycle getCycle() {
    return new Tricycle();
  }
}
