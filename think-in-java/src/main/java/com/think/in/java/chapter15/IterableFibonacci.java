package com.think.in.java.chapter15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
  
  private int n;

  public IterableFibonacci(int count) {
    n = count;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      @Override
      public boolean hasNext() {
        return n > 0;
      }

      @Override
      public Integer next() {
        n--;
        return IterableFibonacci.this.next();
      }
    };
  }

  public static void main(String[] args) {
    for (int i : new IterableFibonacci(18)) {
      System.out.print(i + " ");
    }
  }
}
