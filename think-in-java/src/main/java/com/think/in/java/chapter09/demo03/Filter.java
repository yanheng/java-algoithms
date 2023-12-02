package com.think.in.java.chapter09.demo03;

public class Filter {
  public String name() {
    return getClass().getSimpleName();
  }

  public Waveform process(Waveform input) {
    return input;
  }
}
