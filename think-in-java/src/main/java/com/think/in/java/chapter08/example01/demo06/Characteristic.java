package com.think.in.java.chapter08.example01.demo06;

public class Characteristic {

  private String s;

  public Characteristic(String s) {
    this.s = s;
    System.out.println("Create Characteristic " + s);
  }

  protected void dispose() {
    System.out.println("disposing Characteristic " + s);
  }
}
