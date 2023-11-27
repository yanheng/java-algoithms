package com.think.in.java.chapter07.example07;

public class Instrument {
  public void play() {
    System.out.println("play......");
  }

  static void tune(Instrument i) {
    i.play();
  }
}
