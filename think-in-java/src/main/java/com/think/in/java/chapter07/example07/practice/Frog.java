package com.think.in.java.chapter07.example07.practice;

public class Frog extends Amphibian {

  @Override
  public void call() {
    System.out.println("gua gua");
  }

  public static void main(String[] args) {
    Amphibian frog = new Frog();
    frog.jump();
    frog.call();
  }
}
