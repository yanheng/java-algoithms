package com.think.in.java.chapter17;

public class DequeTest {
  static void fillTest(Deque<Integer> deque) {
    for (int i = 20; i < 27; i++) {
      deque.addFirst(i);
    }

    for (int i = 50; i < 55; i++) {
      deque.addLast(i);
    }
  }

  public static void main(String[] args) {
    Deque<Integer> di = new Deque<>();
    fillTest(di);
    System.out.println(di);

    while (di.size() != 0) {
      di.removeFirst();
    }

    System.out.println(di);

    fillTest(di);
    System.out.println(di);
    while (di.size() != 0) {
      di.removeLast();
    }
    System.out.println(di);
  }
}
