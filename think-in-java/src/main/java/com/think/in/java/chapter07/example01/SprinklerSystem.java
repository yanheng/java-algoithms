package com.think.in.java.chapter07.example01;

public class SprinklerSystem {

  private String value1, value2, value3, value4;

  private WaterSource source = new WaterSource();

  private int i;

  private float f;

  public String toString() {
    return "value1 = " + value1 + " " +
            "value2 = " + value2 + " " +
            "value3 = " + value3 + " " +
            "value4 = " + value4 + "\n" +
            "i = " + i + " " + "f = " + f + " " +
            "source = " + source;
  }

  public static void main(String[] args) {
    SprinklerSystem sprinklerSystem = new SprinklerSystem();
    System.out.println(sprinklerSystem);
  }
}
