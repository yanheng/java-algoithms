package com.think.in.java.chapter11.demo04;

import java.util.*;

public class InterfaceVsIterator {
  public static void display(Iterator<Pet> it) {
    while (it.hasNext()) {
      Pet p = it.next();
      System.out.println(p.id() + ":" + p +" ");
    }
    System.out.println();
  }

  public static void display(Collection<Pet> pets) {
    for (Pet p : pets) {
      System.out.println(p.id() + ":" + p +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<Pet> pets = Pets.arrayList(8);
    Set<Pet> petSet = new HashSet<>(pets);
    Map<String, Pet> petMap = new LinkedHashMap<>();
    String[] names = ("Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(",");
    for (int i = 0; i < names.length; i++) {
      petMap.put(names[i], pets.get(i));
    }

    display(pets);
    display(petSet);
    display(pets.iterator());
    display(petSet.iterator());
    System.out.println(petMap);
    System.out.println(petMap.keySet());
    display(petMap.values());
    display(petMap.values().iterator());
  }
}
