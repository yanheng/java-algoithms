package com.think.in.java.chapter09.practice18;

public class Factory {
  public static void reset(CycleFactory factory) {
    Cycle cycle = factory.getCycle();
    cycle.reset();
  }

  public static void main(String[] args) {
    reset(new UnicycleFactory());
    reset(new BicycleFactory());
    reset(new TricycleFactory());
  }
}
