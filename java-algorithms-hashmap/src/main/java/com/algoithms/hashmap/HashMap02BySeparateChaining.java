package com.algoithms.hashmap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class HashMap02BySeparateChaining<K, V> implements Map<K, V>{
  Logger logger = LoggerFactory.getLogger(HashMap02BySeparateChaining.class);

  private final LinkedList<Node<K, V>>[] tab = new LinkedList[8];

  @Override
  public void put(K key, V value) {
    int idx = key.hashCode() & (tab.length - 1);

    if (tab[idx] == null) {
      tab[idx] = new LinkedList<>();
    }
    tab[idx].add(new Node<>(key, value));

  }

  @Override
  public V get(K key) {
    int idx = key.hashCode() & (tab.length - 1);
    for (Node<K, V> kvNode : tab[idx]) {
      if (key.equals(kvNode.getKey())) {
        return kvNode.getValue();
      }
    }
    return null;
  }

  static class Node<K, V> {
    final K key;
    V value;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }
  }
}
