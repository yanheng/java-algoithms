package com.think.in.java.chapter09.demo01;

public abstract class Instrument {
  private int i;

  public abstract void play(Note i);

  public String what() {
    return "Instrument";
  }

  public abstract void adjust();
}
