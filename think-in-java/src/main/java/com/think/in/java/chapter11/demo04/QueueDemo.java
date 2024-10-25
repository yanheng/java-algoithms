package com.think.in.java.chapter11.demo04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
  public static void printD(Queue queue) {
    while (queue.peek() != null) {
      System.out.print(queue.remove());
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      queue.offer(rand.nextInt(i + 10));
    }
    printD(queue);

    Queue<Character> qc = new LinkedList<>();
    for (char c : "Brontosaurus".toCharArray()) {
      qc.offer(c);
    }
    printD(qc);
  }
}
