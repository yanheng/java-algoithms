package com.think.in.java.chapter17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AssociativeArray<K, V> {

  private Object[][] pairs;

  private int index;

  public AssociativeArray(int length) {
    pairs = new Object[length][2];
  }

  public void put(K key, V value) {
    if (index >= pairs.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    pairs[index++] = new Object[]{key, value};
  }

  public V get(K key) {
    for (int i = 0; i < index; i++) {
      if (key.equals(pairs[i][0])) {
        return (V) pairs[i][1];
      }
    }
    return null;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < index; i++) {
      result.append(pairs[i][0].toString());
      result.append(":");
      result.append(pairs[i][1].toString());
      if (i < index - 1) {
        result.append("\n");
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    AssociativeArray<String, String> map = new AssociativeArray<>(4);
    map.put("sky", "blue");
    map.put("grass", "green");
    map.put("ocean", "dancing");
    map.put("tree", "tall");
    System.out.println(map);

    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("sky", "blue");
    hashMap.put("grass", "green");
    hashMap.put("ocean", "dancing");
    hashMap.put("tree", "tall");
    System.out.println(hashMap);

    TreeMap<String, String> treeMap = new TreeMap<>();
    treeMap.put("sky", "blue");
    treeMap.put("grass", "green");
    treeMap.put("ocean", "dancing");
    treeMap.put("tree", "tall");
    System.out.println(treeMap);

    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("sky", "blue");
    linkedHashMap.put("grass", "green");
    linkedHashMap.put("ocean", "dancing");
    linkedHashMap.put("tree", "tall");
    System.out.println(linkedHashMap);

  }
}
