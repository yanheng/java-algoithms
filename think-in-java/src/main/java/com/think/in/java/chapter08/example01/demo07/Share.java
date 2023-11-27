package com.think.in.java.chapter08.example01.demo07;


public class Share {
  private int refCount = 0;

  private static long counter = 0;

  private final long id = counter++;

  public Share() {
    System.out.println("Creating " + this);
  }

  public void addRef() {
    refCount++;
  }

  protected void dispose() {
    if (--refCount == 0) {
      System.out.println("Disposing " + this);
    } else {
      System.out.println("Share.refCount = " + refCount);
    }
  }

  public String toString() {
    return "Share " + id;
  }
}
