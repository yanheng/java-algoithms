package com.think.in.java.chapter08.example01.demo01;

public class Percussion extends Instrument{

  @Override
  public void play(Note n) {
    System.out.println("Percussion.play() " + n);
  }

  @Override
  public String toString() {
    return "Percussion";
  }

  @Override
  public void adjust() {
    System.out.println("Adjust Percussion");
  }
}
