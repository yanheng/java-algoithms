package com.think.in.java.chapter09.demo01;

public class Wind extends Instrument {
  @Override
  public void play(Note i) {
    System.out.println("Wind.play() " + i);
  }

  @Override
  public String what() {
    return "Wind";
  }

  @Override
  public void adjust() {

  }
}
