package com.think.in.java.chapter10.demo05;

import com.think.in.java.chapter10.demo04.Destination;

public class Parcel5 {
  public Destination destination(String s) {
    class PDestination implements Destination {
      private String label;

      public PDestination(String whereTo) {
        this.label = whereTo;
      }

      @Override
      public String readLabel() {
        return label;
      }
    }
    return new PDestination(s);
  }

  public static void main(String[] args) {
    Parcel5 p = new Parcel5();
    Destination destination = p.destination("");
    
  }
}
