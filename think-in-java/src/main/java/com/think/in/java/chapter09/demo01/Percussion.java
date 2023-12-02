package com.think.in.java.chapter09.demo01;

public class Percussion extends Instrument{
  @Override
  public void play(Note i) {
    System.out.println("Percussion.play() " + i);
  }

  @Override
  public String what() {
    return "Percussion";
  }

  @Override
  public void adjust() {

  }
}
