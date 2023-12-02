package com.think.in.java.chapter10.demo02;

public class Sequence {
  private Object[] items;

  private int next = 0;

  public Sequence(int size) {
    items = new Object[size];
  }

  public void add(Object x) {
    if (next < items.length) {
      items[next++] = x;
    }
  }

  private class SequenceSelector implements Selector {

    private int i = 0;

    @Override
    public boolean end() {
      return i == items.length;
    }

    @Override
    public Object current() {
      return items[i];
    }

    @Override
    public void next() {
      if (i < items.length) {
        i++;
      }
    }
  }

  public Selector getSelector() {
    return new SequenceSelector();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for (int i = 0; i < 10; i++) {
      sequence.add(Integer.toString(i));
    }

    Selector selector = sequence.getSelector();
    while (!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }

    System.out.println();
    Sequence sequence1 = new Sequence(10);
    for (int i = 0; i < 10; i++) {
      sequence1.add(new MyStr(Integer.toString(i)));
    }
    Selector selector1 = sequence1.getSelector();
    while (!selector1.end()) {
      System.out.print(selector1.current() + " ");
      selector1.next();
    }
  }
}
