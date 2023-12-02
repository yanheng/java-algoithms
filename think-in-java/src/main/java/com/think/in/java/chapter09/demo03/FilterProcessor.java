package com.think.in.java.chapter09.demo03;

public class FilterProcessor {
  public static void main(String[] args) {
    Waveform w = new Waveform();
    Apply.process(new FilterAdapter(new LowPass(1.0)), w);
    Apply.process(new FilterAdapter(new HighPass(2.0)), w);
    Apply.process(new FilterAdapter(new BandPass(1.0, 2.0)), w);
  }
}
