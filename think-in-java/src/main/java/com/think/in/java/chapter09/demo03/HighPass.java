package com.think.in.java.chapter09.demo03;

public class HighPass extends Filter {

  double cutoff;

  public HighPass(double cutoff) {
    this.cutoff = cutoff;
  }

  public Waveform process(Waveform input) {
    return input;
  }
}
