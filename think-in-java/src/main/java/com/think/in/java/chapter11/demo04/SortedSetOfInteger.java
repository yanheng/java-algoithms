package com.think.in.java.chapter11.demo04;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {
  public static void main(String[] args) {
    Random rand = new Random(47);
    SortedSet<Integer> intSet = new TreeSet<>();
    for (int i = 0; i < 1000; i++) {
      intSet.add(rand.nextInt(30));
    }
    System.out.println(intSet);
  }
}
