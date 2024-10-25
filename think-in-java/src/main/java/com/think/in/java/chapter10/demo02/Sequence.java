package com.think.in.java.chapter10.demo02;

import java.util.Arrays;
import java.util.Iterator;

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

  public void iterator() {
    Iterator<Object> iterator = Arrays.asList(items).iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
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

  private class ReverseSelector implements Selector {
    private int i = items.length;

    @Override
    public boolean end() {
      return i == 0;
    }

    @Override
    public Object current() {
      return items[i - 1];
    }

    @Override
    public void next() {
      if (i > 0) {
        i--;
      }
    }
  }

  public Selector getSelector() {
    return new SequenceSelector();
  }

  public Selector reverseSelector() {
    return new ReverseSelector();
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
    System.out.println("====================");

    Selector selector2 = sequence.reverseSelector();
    while (!selector2.end()) {
      System.out.print(selector2.current() + " ");
      selector2.next();
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

    System.out.println("***********");
    sequence.iterator();
  }
}
