package com.think.in.java.chapter17.practice;

import com.think.in.java.chapter17.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    Countries countries = new Countries();
    List<Countries> list = new ArrayList<>(Collections.nCopies(4, countries));

    Collections.fill(list, countries);
    System.out.println(list);
  }
}
