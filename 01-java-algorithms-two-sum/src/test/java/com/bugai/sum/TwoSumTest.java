package com.bugai.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

  @Test
  void test_twoSum() {
    TwoSum twoSum = new TwoSum();

    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] ints = twoSum.twoSum01(nums, target);
    int[] except = new int[]{0, 1};
    assertArrayEquals(except, ints);

    int[] ints02 = twoSum.twoSum02(nums, target);
    assertArrayEquals(except, ints02);

    int[] ints03 = twoSum.twoSum03(nums, target);
    assertArrayEquals(except, ints03);
  }
}