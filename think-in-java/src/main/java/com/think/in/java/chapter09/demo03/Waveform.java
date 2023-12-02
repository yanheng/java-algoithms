package com.think.in.java.chapter09.demo03;

public class Waveform {
  private static long counter;

  private final long id = counter++;

  @Override
  public String toString() {
    return "Waveform" + id;
  }
}
