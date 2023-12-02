package com.think.in.java.chapter09.practice10;

public class Stringed implements Instrument, Playable {
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
