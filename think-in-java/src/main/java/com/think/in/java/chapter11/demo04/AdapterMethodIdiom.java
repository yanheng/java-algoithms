package com.think.in.java.chapter11.demo04;

import java.util.Arrays;

public class AdapterMethodIdiom {
  public static void main(String[] args) {
    ReversibleArrayList<String> ral = new ReversibleArrayList<>(
            Arrays.asList("To be or not to be".split(" "))
    );

    for (String s : ral) {
      System.out.print(s + " ");
    }

    System.out.println();

    for (String s : ral.reversed()) {
      System.out.print(s + " ");
    }
  }
}
