package com.think.in.java.chapter09.demo03;

public class LowPass extends Filter {
  double cutoff;

  public LowPass(double cutoff) {
    this.cutoff = cutoff;
  }

  public Waveform process(Waveform input) {
    return input;
  }
}
