package com.think.in.java.chapter09.practice09;

public class Stringed extends AbstractIns implements Instrument {
  @Override
  public void play(Note i) {
    System.out.println(this + ".play() " + i);
  }

  @Override
  public String toString() {
    return "Stringed";
  }

  @Override
  public void adjust() {
    System.out.println(this + ".adjust()");
  }
}
