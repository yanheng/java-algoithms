package com.think.in.java.chapter07.example09;

public class Beetle extends Insect {

  private int k = printInit("Beetle.k initialized.");

  public Beetle() {
    System.out.println("k = " + k);
    System.out.println("j = " + j);
  }

  private static int x2 = printInit("static Beetle.x2 initialized.");

  public static void main(String[] args) {
    Beetle b = new Beetle();
  }
}
