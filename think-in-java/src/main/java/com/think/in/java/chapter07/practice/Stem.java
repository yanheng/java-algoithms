package com.think.in.java.chapter07.practice;

public class Stem extends Root {

  private Component1 component1 = new Component1();

  private Component2 component2 = new Component2();

  public Component3 component3 = new Component3();

  private int x;

  public Stem() {
    System.out.println("Stem constructor");
  }

  public Stem(int x) {
    super(x);
    System.out.println("Stem constructor x = " + this.x);
  }

  public void dispose() {
    component1.dispose();
    component2.dispose();
    component3.dispose();
    super.dispose();
    System.out.println("Stem dispose()");
  }

  public static void main(String[] args) {
    Stem s = new Stem(5);
    try {

    } finally {
      s.dispose();
    }

  }
}
