package com.bugai.algoithms;

public interface BlockingQueue <E> extends Queue<E>{
  boolean add(E e);

  boolean offer(E e);
}
