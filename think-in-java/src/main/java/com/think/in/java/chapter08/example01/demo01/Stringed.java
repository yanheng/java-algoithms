package com.think.in.java.chapter08.example01.demo01;

public class Stringed extends Instrument {
  @Override
  public void play(Note n) {
    System.out.println("Stringed play() " + n);
  }

  @Override
  public String toString() {
    return "Stringed";
  }

  @Override
  public void adjust() {
    System.out.println("Adjust Stringed");
  }
}
