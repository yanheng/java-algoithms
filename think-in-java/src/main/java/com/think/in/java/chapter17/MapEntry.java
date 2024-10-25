package com.think.in.java.chapter17;

import java.util.Map;
import java.util.Objects;

public class MapEntry<K, V> implements Map.Entry<K, V>{
  private K key;
  private V value;

  public MapEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }
  @Override
  public K getKey() {
    return key;
  }

  @Override
  public V getValue() {
    return value;
  }

  @Override
  public V setValue(V v) {
    V result = value;
    value = v;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    MapEntry<?, ?> mapEntry = (MapEntry<?, ?>) o;
    return Objects.equals(key, mapEntry.key) && Objects.equals(value, mapEntry.value);
  }

  @Override
  public int hashCode() {
    return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
  }
}
