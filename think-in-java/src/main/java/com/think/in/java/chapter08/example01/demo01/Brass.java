package com.think.in.java.chapter08.example01.demo01;

public class Brass extends Wind {

  @Override
  public void play(Note n) {
    System.out.println("Brass.play() " + n);
  }

  @Override
  public String toString() {
    return "Brass";
  }

  @Override
  public void adjust() {
    System.out.println("Adjust Brass");
  }
}
