package com.bugai.algoithms.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayDeque<E> implements Deque<E> {

  private final Logger logger = LoggerFactory.getLogger(ArrayDeque.class);

  transient Object[] elements;

  transient int head;

  transient int tail;

  public ArrayDeque() {
    elements = new Object[2];
  }

  @Override
  public void push(E e) {
    if (e == null) {
      throw new NullPointerException();
    }
    elements[head=(head - 1) & (elements.length - 1)] = e;
    logger.info("push.idx head：{}", head);
    if (head == tail) {
      doubleCapacity();
    }

  }

  private void doubleCapacity() {
    assert head == tail;
    int p = head;
    int n = elements.length;
    int r = n - p;

    int newCapacity = n << 1;
    if (newCapacity < 0) {
      throw new IllegalStateException("Sorry, deque too big");
    }
    Object a[] = new Object[newCapacity];
    // 先copy head左侧的元素， 再copy head右侧的。
    System.arraycopy(elements, p, a, 0, r);
    System.arraycopy(elements, 0, a, r, p);
    elements = a;
    head = 0;
    tail = n;
  }

  @Override
  public E pop() {
    int h = head;
    E result = (E) elements[h];
    if (result == null) {
      return null;
    }
    elements[h] = null;
    head = (h + 1) & (elements.length - 1);
    logger.info("pop.idx {} = {} & {}", head, Integer.toBinaryString(h + 1), Integer.toBinaryString(elements.length - 1));
    return result;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }
}
