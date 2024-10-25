package com.think.in.java.chapter11.demo04;

import java.util.ArrayList;
import java.util.List;

public class Pets {

  public static List<Pet> arrayList(int num) {
    List<Pet> pets = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      pets.add(new Pet(i + ""));
    }
    return pets;
  }

  public static Pet[] createArray(int num) {
    Pet[] pets = new Pet[8];
    for (int i = 0; i < pets.length; i++) {
      pets[i] = new Pet(i + "");
    }
    return pets;
  }
}
