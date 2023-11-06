package com.bugai.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of intergers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2 Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class SumOfTwo {
  public static int[] sum2_1(int[] numbers, int target) {
    int[] result = {0, 0};
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          result[0] = i + 1;
          result[1] = j + 1;
          return result;
        }
      }
    }
    return result;
  }

  /**
   * 使用map
   *
   * @param numbers
   * @param target
   * @return
   */
  public static int[] sum2_2(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])) {
        return new int[]{map.get(target - numbers[i]) + 1, i + 1};
      }
      map.put(numbers[i], i);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] numbers = {3, 3};
    int target = 6;
    int[] ints = SumOfTwo.sum2_1(numbers, target);
    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

    int[] ints1 = SumOfTwo.sum2_2(numbers, target);
    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints1[i]);
    }
  }
}
