package com.bugai.algoithms.stack;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDequeTest {

  Logger logger = LoggerFactory.getLogger(ArrayDequeTest.class);

  @Test
  void push() {
    Deque deque = new ArrayDeque();
    deque.push(1);
    deque.push(2);
    deque.push(3);
    deque.push(4);
    deque.push(5);
    deque.push(6);
    deque.push(7);

    logger.info("弹出元素：{}", deque.pop());
    logger.info("弹出元素：{}", deque.pop());
    logger.info("弹出元素：{}", deque.pop());
    logger.info("弹出元素：{}", deque.pop());
    logger.info("弹出元素：{}", deque.pop());
    logger.info("弹出元素：{}", deque.pop());

  }

  @Test
  void pop() {
  }

  @Test
  void isEmpty() {
  }
}