package com.think.in.java.chapter15;

public class Coffee {
  public static long counter = 0;

  private final long id = counter++;

  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
}
