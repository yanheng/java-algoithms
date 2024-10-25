package com.think.in.java.chapter11.demo04;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<>(
            new TextFile("SetOperations.java", "\\W+")
    );

  }
}
