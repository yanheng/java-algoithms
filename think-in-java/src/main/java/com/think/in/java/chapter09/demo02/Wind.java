package com.think.in.java.chapter09.demo02;

public class Wind implements Instrument {
  @Override
  public void play(Note i) {
    System.out.println(this + ".play() " + i);
  }

  public String toString() {
    return "Wind";
  }

  @Override
  public void adjust() {
    System.out.println(this + ".adjust() ");
  }
}
