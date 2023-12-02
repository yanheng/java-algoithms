package com.think.in.java.chapter09.practice16;

import java.util.Random;

public class RandomChars {
  private static Random rand = new Random();


  public char next() {
    return (char) ('a' + rand.nextInt(26));
  }

}
