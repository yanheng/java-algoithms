package com.think.in.java.chapter09.demo01;

public class Stringed extends Instrument{
  @Override
  public void play(Note i) {
    System.out.println("Stringed.play() " + i);
  }

  @Override
  public String what() {
    return "Stringed";
  }

  @Override
  public void adjust() {

  }
}
