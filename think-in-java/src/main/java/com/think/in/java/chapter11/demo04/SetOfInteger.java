package com.think.in.java.chapter11.demo04;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
  public static void main(String[] args) {
    Random random = new Random(47);

    Set<Integer> intSet = new HashSet<>();
    for (int i = 0; i < 1000; i++) {
      intSet.add(random.nextInt(20));
    }

    System.out.println(intSet);
  }
}
