package com.think.in.java.chapter17;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer> {

  private int size;

  public CountingIntegerList(int size) {
    this.size = size < 0 ? 0 : size;
  }

  @Override
  public Integer get(int index) {
    return Integer.valueOf(index);
  }

  @Override
  public int size() {
    return size;
  }


  public static void main(String[] args) {
    System.out.println(new CountingIntegerList(30));
  }
}
