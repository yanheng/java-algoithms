package com.think.in.java.chapter09.practice10;

public class Music5 {
  static void tune(Playable i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Playable[] e) {
    for (Playable instrument : e) {
      tune(instrument);
    }
  }

  public static void main(String[] args) {
    Playable[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };

    tuneAll(orchestra);
  }
}
