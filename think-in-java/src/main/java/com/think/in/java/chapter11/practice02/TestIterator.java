package com.think.in.java.chapter11.practice02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

  public static void iterator(Collection collection) {
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toString());
    }
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    iterator(list);
  }
}
