package com.bugai.algoithms;

import java.util.Arrays;

public class ArrayList<E> implements List<E>{
  /**
   * 默认初始空间
   */
  private static final int DEFAULT_CAPACITY = 10;

  private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

  transient Object[] elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;

  private int size;

  public ArrayList() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
  }


  @Override
  public boolean add(E e) {
    int minCapacity = size + 1;
    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
      minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
    }

    if (minCapacity - elementData.length > 0) {
      int oldCapacity = elementData.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);

      if (newCapacity - minCapacity < 0) {
        newCapacity = minCapacity;
      }
      elementData = Arrays.copyOf(elementData, newCapacity);
    }
    elementData[size++] = e;
    return true;
  }



  public E remove(int index) {
    E oldValue = (E) elementData[index];
    int numMoved = size - index - 1;
    if (numMoved > 0) {
      System.arraycopy(elementData, index + 1, elementData, index, numMoved);
    }

    elementData[--size] = null;
    return oldValue;
  }

  public E get(int index) {
    return (E) elementData[index];
  }

  @Override
  public String toString() {
    return "ArrayList{" +
            "elementData=" + Arrays.toString(elementData) +
            ", size=" + size +
            '}';
  }

  public static void main(String[] args) {
    System.out.println(1>>1);
    ArrayList list = new ArrayList();
    list.add("01");
    list.add("02");
    list.add("03");
    list.add("04");
    list.add("05");
    list.add("06");
    list.add("07");
    list.add("08");
    list.add("09");
    list.add("10");
    list.add("11");
    list.add("12");

    System.out.println(list);

    list.remove(9);

    System.out.println(list);
  }

}
