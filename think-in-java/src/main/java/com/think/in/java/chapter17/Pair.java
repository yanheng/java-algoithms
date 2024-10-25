package com.think.in.java.chapter17;

public class Pair<K, V> {
  public final K key;
  public final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }
}
