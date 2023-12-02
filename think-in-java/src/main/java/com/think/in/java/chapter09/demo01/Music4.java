package com.think.in.java.chapter09.demo01;

public class Music4 {
  static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for (Instrument instrument : e) {
      tune(instrument);
    }
  }

  public static void main(String[] args) {
    Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };

    tuneAll(orchestra);
  }
}
