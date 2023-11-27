package com.bugai.reflection.demo09;

import java.lang.reflect.Array;

public class ReflectArray {
  public static void main(String[] args) {
    int[] intArray = (int[]) Array.newInstance(int.class, 3);
    Array.set(intArray, 0, 123);
    Array.set(intArray, 1, 234);
    Array.set(intArray, 2, 345);
    for (int i : intArray) {
      System.out.println(i);
    }

    Class<String[]> aClass = String[].class;
    System.out.println(aClass.getName());
    Class<int[]> aClass1 = int[].class;
    System.out.println(aClass1.getName());
    Class<long[]> aClass2 = long[].class;
    System.out.println(aClass2.getName());
    Class<float[]> aClass3 = float[].class;
    System.out.println(aClass3.getName());
    Class<byte[]> aClass4 = byte[].class;
    System.out.println(aClass4.getName());



  }
}
