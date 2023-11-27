package com.think.in.java.chapter08.example01.demo06;

public class Animal extends LivingCreature {

  private Characteristic p = new Characteristic("has heart");

  private Description t = new Description("Animal not Vegetable");

  public Animal() {
    System.out.println("Animal()");
  }

  protected void dispose() {
    System.out.println("Animal dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}
