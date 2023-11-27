package com.think.in.java.chapter07.example01;

public class Soap {
  private String s;

  Soap() {
    System.out.println("Soap()");
    s = "Constructed";
  }

  @Override
  public String toString() {
    return s;
  }
}
