package com.think.in.java.chapter09.demo01;

public class Woodwind extends Wind {
  @Override
  public void play(Note i) {
    System.out.println("Woodwind.play() " + i);
  }

  @Override
  public String what() {
    return "Woodwind";
  }
}
