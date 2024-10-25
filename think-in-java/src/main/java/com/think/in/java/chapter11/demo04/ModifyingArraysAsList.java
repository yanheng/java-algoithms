package com.think.in.java.chapter11.demo04;

import java.util.*;

public class ModifyingArraysAsList {
  public static void main(String[] args) {
    Random rand = new Random(47);
    Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    List<Integer> list = new ArrayList<>(Arrays.asList(ia));

    System.out.println("Before shuffling:" + list);
    Collections.shuffle(list, rand);
    System.out.println("After shuffling:" + list);
    System.out.println("array: " + Arrays.toString(ia));


    List<Integer> list1 = Arrays.asList(ia);
    System.out.println("Before shuffling:" + list1);
    Collections.shuffle(list1, rand);
    System.out.println("After shuffling:" + list1);
    System.out.println("array: " + Arrays.toString(ia));
  }
}
