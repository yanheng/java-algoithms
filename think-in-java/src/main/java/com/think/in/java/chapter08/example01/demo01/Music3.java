package com.think.in.java.chapter08.example01.demo01;

public class Music3 {


  static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

  public static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  public static void tuneAll(Instrument[] e) {
    for (Instrument instrument : e) {
      tune(instrument);
    }
  }

  public static void main(String[] args) {
    //    Instrument[] instruments = {
    //            new Wind(),
    //            new Percussion(),
    //            new Stringed(),
    //            new Brass(),
    //            new Woodwind()
    //    };
    //    tuneAll(instruments);
    //
    //    System.out.println(new Instrument());

    Instrument[] instruments = new Instrument[12];
    for (int i = 0; i < instruments.length; i++) {
      instruments[i] = gen.next();
    }

    tuneAll(instruments);

  }
}
