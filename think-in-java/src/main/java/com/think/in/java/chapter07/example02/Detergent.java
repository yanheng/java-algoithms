package com.think.in.java.chapter07.example02;

public class Detergent {

  public Cleanser cleanser = new Cleanser();


  public Detergent() {

  }


  public void dilute() {
    cleanser.dilute();
  }

  public void apply() {
    cleanser.apply();
  }


  public void scrub() {
    cleanser.append(" Detergent.scrub()");
  }

  public void foam() {
    cleanser.append(" foam()");
  }

  public String toString() {
    return cleanser.toString();
  }

  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class:");
    Cleanser.main(args);
  }
}
