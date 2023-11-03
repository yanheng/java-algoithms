package com.bugai.algoithms;

public interface Queue<E> {
  boolean add(E e);

  boolean offer(E e);

  E poll();

  E peek();

}
