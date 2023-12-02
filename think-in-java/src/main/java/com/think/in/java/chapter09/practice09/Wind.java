package com.think.in.java.chapter09.practice09;

public class Wind extends AbstractIns implements Instrument {
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
