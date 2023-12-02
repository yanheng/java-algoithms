package com.think.in.java.chapter09.demo01;

public class Brass extends Wind {

  @Override
  public void play(Note i) {
    System.out.println("Brass.play() " + i);
  }

  @Override
  public void adjust() {
    System.out.println("Brass.adjust()");
  }
}
