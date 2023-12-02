package com.think.in.java.chapter09.demo02;

public class Percussion implements Instrument {
  @Override
  public void play(Note i) {
    System.out.println(this + ".play() " + i);
  }

  @Override
  public String toString() {
    return "Percussion";
  }

  @Override
  public void adjust() {
    System.out.println(this + ".adjust()");
  }
}
