package com.bugai.leetcode;

import java.util.Iterator;
import java.util.Vector;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 */
public class SumOfThree {

  public static Vector sumEqZero(int[] arr) {
    int[] result = new int[3];
    Vector vector = new Vector<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if ((arr[i] + arr[j] + arr[k]) == 0) {
            result[0] = i;
            result[1] = j;
            result[2] = k;
            vector.add(result);
          }
        }
      }
    }
    return vector;
  }

  public static void main(String[] args) {
    int [] arr = {0, 1, -1, 2, -2, 3, 0, 5};
    Vector vector = SumOfThree.sumEqZero(arr);
    Iterator iterator = vector.iterator();
    while (iterator.hasNext()) {
      int[] next = (int[])iterator.next();
      for (int i = 0; i < next.length; i++) {
        System.out.print(next[i] + ",");
      }
      System.out.println();
    }
  }
}
