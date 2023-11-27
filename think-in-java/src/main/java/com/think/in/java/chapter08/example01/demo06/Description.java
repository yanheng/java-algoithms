package com.think.in.java.chapter08.example01.demo06;

public class Description {

  private String s;

  public Description(String s) {
    this.s = s;
    System.out.println("Creating Description " + s);
  }

  protected void dispose() {
    System.out.println("disposing Description " + s);
  }
}
