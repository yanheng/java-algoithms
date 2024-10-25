package com.think.in.java.chapter10.demo06;

import com.think.in.java.chapter10.demo04.Contents;

public class Parcel7 {

  public Contents contents() {
    return new Contents() {
      private int i = 11;

      @Override
      public int value() {
        return i;
      }
    };
  }

  public static void main(String[] args) {
    Parcel7 p = new Parcel7();
    Contents c = p.contents();
  }
}
