package com.think.in.java.chapter11.demo03;

import java.util.LinkedList;

public class Stack<T> {
  private LinkedList<T> storage = new LinkedList<>();

  public void push(T v) {
    storage.addFirst(v);
  }

  public T peek() {
    return storage.getFirst();
  }

  public T pop() {
    return storage.removeFirst();
  }

  public boolean empty() {
    return storage.isEmpty();
  }

  @Override
  public String toString() {
    return storage.toString();
  }
}
