package com.think.in.java.chapter17;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {
  private List<K> keys = new ArrayList<>();
  private List<V> values = new ArrayList<>();

  public V put(K key, V value) {
    V oldValue = get(key);
    if (!keys.contains(key)) {
      keys.add(key);
      values.add(value);
    } else {
      values.set(keys.indexOf(key), value);
    }

    return value;
  }

  public V get(Object key) {
    if (!keys.contains(key)) {
      return null;
    }
    return values.get(keys.indexOf(key));
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    Set<Map.Entry<K, V>> set = new HashSet<>();
    Iterator<K> ki = keys.iterator();
    Iterator<V> vi = values.iterator();
    while (ki.hasNext()) {
      set.add(new MapEntry<>(ki.next(), vi.next()));
    }
    return set;
  }

  public static void main(String[] args) {
    SlowMap<String, String> m = new SlowMap<>();
    m.putAll(new Countries().capitals(5));
    System.out.println(m);
    System.out.println(m.get("ALGERIA"));
    System.out.println(m.entrySet());
  }
}
