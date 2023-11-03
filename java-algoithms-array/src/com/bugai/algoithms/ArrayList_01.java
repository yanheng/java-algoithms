package com.bugai.algoithms;

import java.util.Arrays;

public class ArrayList_01<E> implements List<E> {

  public final static int DEFAULT_CAPACITY = 10;

  private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

  transient Object[] elementData;

  private int size;

  public ArrayList_01() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
  }

  @Override
  public boolean add(E o) {
    int minCapacity = size + 1;
    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
      minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
    }

    if (minCapacity - elementData.length > 0) {
      int oldCapacity = elementData.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      if (minCapacity - newCapacity > 0) {
        newCapacity = minCapacity;
      }
      elementData = Arrays.copyOf(elementData, newCapacity);
    }
    elementData[size++] = o;

    return true;
  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public E get(int index) {
    if (index >= size || index < 0) {
      throw new IllegalArgumentException();
    }
    return (E) this.elementData[index];
  }


  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    ArrayList_01 arr = new ArrayList_01();
    arr.add("01");
    arr.add("02");
    arr.add("03");
    arr.add("04");
    arr.add("05");
    arr.add("06");
    arr.add("07");
    arr.add("08");
    arr.add("09");
    arr.add("10");
    arr.add("11");
    arr.add("12");

    for (int i = 0; i <  arr.getSize(); i++)
      System.out.print(" "+arr.get(i));


  }
}
