package com.think.in.java.chapter10.demo03;

public class Parcel3 {

  class Contents {
    private int i = 11;
    public int value() {
      return i;
    }
  }

  class Destination {
    private String label;

    Destination(String whereTo) {
      this.label = whereTo;
    }

    String getLabel(){
      return label;
    }
  }

  public static void main(String[] args) {
    Parcel3 p = new Parcel3();
    Contents c = p.new Contents();
    Destination d = p.new Destination("Tasmania");
  }
}
