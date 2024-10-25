package com.think.in.java.chapter11.demo01;

import java.util.*;

public class PrintingContainers {
  static Collection fill(Collection<String> collection) {
    collection.add("rat");
    collection.add("cat");
    collection.add("dog");
    collection.add("dog");
    return collection;
  }

  static Map fill(Map<String, String> map) {
    map.put("rat", "Fuzzy");
    map.put("cat", "Rags");
    map.put("dog", "Bosco");
    map.put("dog", "Spot");
    return map;
  }

  public static void iterator(Collection collection) {
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toString());
    }
  }

  public static void main(String[] args) {
    System.out.println(fill(new ArrayList<String>()));
    System.out.println(fill(new LinkedList<String>()));
    System.out.println(fill(new HashSet<String>()));
    System.out.println(fill(new TreeSet<String>()));
    System.out.println(fill(new LinkedHashSet<String>()));
    System.out.println(fill(new HashMap<String, String>()));
    System.out.println(fill(new TreeMap<String, String>()));
    System.out.println(fill(new LinkedHashMap<String, String>()));

    System.out.println("===============");
    iterator(fill(new ArrayList<String>()));
    iterator(fill(new LinkedList<String>()));
    iterator(fill(new HashSet<String>()));
    iterator(fill(new TreeSet<String>()));
    iterator(fill(new LinkedHashSet<String>()));
  }
}
