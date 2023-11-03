package com.bugai.algoithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class PriorityQueue<E> implements Queue<E> {

  Logger logger = LoggerFactory.getLogger(PriorityQueue.class);

  private static final int DEFAULT_INITIAL_CAPACITY = 11;

  transient Object[] queue;

  private int size = 0;

  public PriorityQueue() {
    queue = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  @Override
  public boolean add(E e) {
    return offer(e);
  }

  @Override
  public boolean offer(E e) {
    logger.info("【插入】节点{}", e);
    if (null == e) {
      throw new NullPointerException();
    }
    int i = size;
    if (i >= queue.length) {
      // 扩容
      grow(i + 1);
    }
    size = i + 1;
    if (i == 0) {
      queue[0] = e;
    } else {
      siftUp(i, e);
    }
    return true;
  }

  private void siftUp(int i, E e) {
    siftUpComparable(i, e);
  }

  @SuppressWarnings("unchecked")
  private void siftUpComparable(int k, E x) {
    Comparable<? super E> key = (Comparable<? super E>) x;
    while (k > 0) {
      int parent = (k - 1) >>> 1;
      logger.info("【入队】寻找当前节点的父节点位置。k：{} parent：{}", k, parent);
      Object e = queue[parent];
      // 如果当前位置元素，大于父节点元素，则退出循环
      if (key.compareTo((E) e) >= 0) {
        logger.info("【入队】值比对，父节点：{} 目标节点：{}", e, key);
        break;
      }

      // 相反父节点位置大于当前位置元素，则进行替换
      logger.info("【入队】替换过程，父子节点位置替换，继续循环。父节点值：{} 存放到位置：{}", e, k);
      queue[k] = e;
      k = parent;
    }
    queue[k] = key;
    logger.info("【入队】完成 Idx：{} Val：{} 当前队列：{} ", k, key, queue);

  }

  private void grow(int minCapacity) {
    int oldCapacity = queue.length;
    // oldCapacity 小于64时扩容2倍， 大于 64时扩容 50%
    int newCapacity = oldCapacity + ((oldCapacity < 64) ?
            (oldCapacity + 2) : oldCapacity >> 1);

    if (newCapacity - (Integer.MAX_VALUE - 8) > 0) {
      newCapacity = (minCapacity > (Integer.MAX_VALUE - 8) ?
              Integer.MAX_VALUE : Integer.MAX_VALUE - 8);
    }
    queue = Arrays.copyOf(queue, newCapacity);

  }

  @Override
  public E poll() {
    if (size == 0) {
      return null;
    }
    int s = --size;
    // 对首元素
    E result = (E) queue[0];
    // 队尾元素
    E x = (E) queue[s];
    queue[s] = null;
    if (s != 0) {
      siftDown(0, x);
    }
    return result;
  }

  @SuppressWarnings("unchecked")
  private void siftDown(int x, E e) {
    siftDownComparable(x, e);
  }

  private void siftDownComparable(int k, E e) {
    Comparable<? super E> key = (Comparable<? super E>) e;
    // 先找出中间件节点
    int half = size >>> 1;
    while (k < half) {
      int child = (k << 1) + 1;
      Object c = queue[child];
      int right = child + 1;
      if (right < size && ((Comparable<? super E>) c).compareTo((E) queue[right]) > 0) {
        c = queue[child = right];
      }
      if (key.compareTo((E) c) <= 0) {
        break;
      }

      queue[k] = c;
      k = child;
    }
    queue[k] = key;
  }

  @Override
  public E peek() {
    return (size == 0) ? null : (E) queue[0];
  }
}
