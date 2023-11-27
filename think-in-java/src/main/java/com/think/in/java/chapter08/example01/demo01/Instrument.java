package com.think.in.java.chapter08.example01.demo01;

public class Instrument {
  public void play(Note n) {
    System.out.println("Instrument play()");
  }

  public String toString() {
    return "Instrument";
  }

  public void adjust() {
    System.out.println("Adjust Instrument");
  }
}
