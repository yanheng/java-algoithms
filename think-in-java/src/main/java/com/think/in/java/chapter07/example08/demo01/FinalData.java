package com.think.in.java.chapter07.example08.demo01;

import java.util.Random;

public class FinalData {
  private static Random random = new Random(47);

  private String id;

  public FinalData(String id) {
    this.id = id;
  }

  private final int valueOne = 9;

  private static final int VALUE_TWO = 99;

  public static final int VALUE_THREE = 39;

  private final int i4 = random.nextInt(20);

  static final int INT_5 = random.nextInt(20);

  private Value v1 = new Value(11);

  private final Value v2 = new Value(22);

  private static final Value VAL_3 = new Value(33);

  private final int[] a = {1, 2, 3, 4, 5, 6};

  @Override
  public String toString() {
    return "FinalData{" +
            "id='" + id + '\'' +
            ", i4=" + i4 +
            ", INT_5 =" + INT_5 +
            '}';
  }

  public static void main(String[] args) {
    FinalData finalData = new FinalData("fd1");
    //    finalData.valueOne++
    finalData.v2.i++;
    finalData.v1 = new Value(9);

    for (int i = 0; i < finalData.a.length; i++) {
      finalData.a[i]++;
    }

    //    finalData.v2 = new Value(0);
    //    finalData.a = new int[3];

    System.out.println(finalData);
    FinalData finalData1 = new FinalData("fd2");
    System.out.println(finalData);
    System.out.println(finalData1);
  }

}
