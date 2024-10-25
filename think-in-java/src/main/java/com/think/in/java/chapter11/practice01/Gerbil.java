package com.think.in.java.chapter11.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerbil {
  private int gerbilNumber;
  private static int count = 0;

  private String hopInfo;

  public Gerbil(String hopInfo) {
    this.gerbilNumber = ++count;
    this.hopInfo = hopInfo;
  }


  public void hop() {
    System.out.println(hopInfo + " --> " + gerbilNumber);
  }

  public static void main(String[] args) {
    List<Gerbil> gerbils = new ArrayList<>();
    gerbils.add(new Gerbil("G1"));
    gerbils.add(new Gerbil("G2"));
    gerbils.add(new Gerbil("G3"));
    gerbils.add(new Gerbil("G4"));
    gerbils.add(new Gerbil("G4"));
    for (Gerbil gerbil : gerbils) {
      gerbil.hop();
    }

    Iterator<Gerbil> iterator = gerbils.iterator();
    while (iterator.hasNext()) {
      iterator.next().hop();
    }
  }
}
