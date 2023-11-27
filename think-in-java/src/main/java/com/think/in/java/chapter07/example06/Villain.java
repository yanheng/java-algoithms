package com.think.in.java.chapter07.example06;

public class Villain {
  private String name;

  protected void set(String nm) {
    this.name = nm;
  }

  public Villain(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a Villain and my name is " + name;
  }
}
