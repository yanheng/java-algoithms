package com.bugai.leetcode;

import java.util.*;

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

  public static List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if ((nums[i] + nums[j] + nums[k]) == 0) {
            List<Integer> item = new ArrayList<>();
            item.add(i);
            item.add(j);
            item.add(k);
            result.add(item);
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    //    int[] arr = {0, 1, -1, 2, -2, 3, 0, 5};
    //    Vector vector = SumOfThree.sumEqZero(arr);
    //    Iterator iterator = vector.iterator();
    //    while (iterator.hasNext()) {
    //      int[] next = (int[]) iterator.next();
    //      for (int i = 0; i < next.length; i++) {
    //        System.out.print(next[i] + ",");
    //      }
    //      System.out.println();
    //    }

    int[] arr = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> lists = threeSum(arr);
    Iterator<List<Integer>> iterator = lists.iterator();
    while (iterator.hasNext()) {
      List<Integer> next = iterator.next();
      for (int i = 0; i < next.size(); i++) {
        System.out.print(next.get(i) + ",");
      }
      System.out.println();
    }

  }
}
