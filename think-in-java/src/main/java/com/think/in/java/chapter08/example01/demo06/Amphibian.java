package com.think.in.java.chapter08.example01.demo06;

public class Amphibian extends Animal {
  private Characteristic p = new Characteristic("can live in water");

  private Description t = new Description("Both water and land");


  public Amphibian() {
    System.out.println("Amphibian");
  }

  @Override
  protected void dispose() {
    System.out.println("Amphibian dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}
