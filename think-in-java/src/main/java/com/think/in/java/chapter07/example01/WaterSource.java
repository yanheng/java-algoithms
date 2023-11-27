package com.think.in.java.chapter07.example01;

public class WaterSource {
  private String s;

  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }

  public String toString() {
    return s;
  }
}
