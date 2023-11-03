package com.algoithms.hashmap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashMap04ByCoalescedHashing<K, V> implements Map<K, V> {

  Logger logger = LoggerFactory.getLogger(HashMap04ByCoalescedHashing.class);

  private final Node<K, V>[] tab = new Node[8];

  @Override
  public void put(K key, V value) {
    int idx = key.hashCode() & (tab.length - 1);
    if (tab[idx] == null) {
      tab[idx] = new Node<>(key, value);
      logger.info("tab idx:{}, key: {}, idxOfNext: {}", idx, tab[idx].key, tab[idx].idxOfNext);
      return;
    }

    int cursor = tab.length - 1;
    while (tab[cursor] != null && !tab[cursor].key.equals(key)) {
      --cursor;
    }
    tab[cursor] = new Node<>(key, value);

    while (tab[idx].idxOfNext != 0) {
      idx = tab[idx].idxOfNext;
    }

    tab[idx].idxOfNext = cursor;
    logger.info("tab idx:{}, key: {}, idxOfNext: {}", idx, tab[idx].key, tab[idx].idxOfNext);

  }

  @Override
  public V get(K key) {
    int idx = key.hashCode() & (tab.length - 1);
    while (tab[idx].key != key) {
      idx = tab[idx].idxOfNext;
    }
    return tab[idx].value;
  }

  static class Node<K, V> {
    final K key;
    V value;
    int idxOfNext;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
