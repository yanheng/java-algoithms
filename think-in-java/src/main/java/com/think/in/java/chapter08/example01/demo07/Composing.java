package com.think.in.java.chapter08.example01.demo07;

public class Composing {

  private Share share;

  private static long counter = 0;

  private final long id = counter++;

  public Composing(Share share) {
    System.out.println("Creating " + this);
    this.share = share;
    this.share.addRef();
  }

  protected void dispose() {
    System.out.println("dispose " + this);
    share.dispose();
  }

  public String toString() {
    return "Composing " + id;
  }


}
