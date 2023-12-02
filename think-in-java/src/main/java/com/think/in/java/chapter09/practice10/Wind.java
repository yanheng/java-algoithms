package com.think.in.java.chapter09.practice10;

public class Wind implements Instrument, Playable {
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
