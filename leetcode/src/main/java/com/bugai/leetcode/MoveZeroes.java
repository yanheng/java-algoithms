package com.bugai.leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    int count = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 0) {
        // 记录当前找到的0位
        // 后面的元素向前移动覆盖
        for (int j = i; j < nums.length - 1 - count; j++) {
          nums[j] = nums[j + 1];
        }
        nums[nums.length - 1 - count] = 0;
        count++;
      }
    }
  }

  /**
   * 1、将不等于0的值，按相对顺序整理
   * 2、剩余部分赋值为0
   *
   * @param nums
   */
  public void moveZeroes_1(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }

    for (; j < nums.length; j++) {
      nums[j] = 0;
    }
  }

  public static void main(String[] args) {
    MoveZeroes zeroes = new MoveZeroes();

    int[] nums = {0, 1};
    zeroes.moveZeroes_1(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}
