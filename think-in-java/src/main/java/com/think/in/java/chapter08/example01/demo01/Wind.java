package com.think.in.java.chapter08.example01.demo01;

public class Wind extends Instrument {

  @Override
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }

  @Override
  public String toString() {
    return "Wind";
  }

  @Override
  public void adjust() {
    System.out.println("Adjust Wind");
  }
}
