package com.think.in.java.chapter08.example01.demo01;

public class Woodwind extends Wind {

  @Override
  public void play(Note n) {
    System.out.println("Woodwind play() " + n);
  }


  @Override
  public String toString() {
    return "Woodwind";
  }

  @Override
  public void adjust() {
    System.out.println("Adjust Woodwind");
  }
}
