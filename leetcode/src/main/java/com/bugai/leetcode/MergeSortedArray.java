package com.bugai.leetcode;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p>
 * Note:
 * You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 */
public class MergeSortedArray {

  /**
   * 数组A的长度大于等于 m + n
   *
   * @param A
   * @param m
   * @param B
   * @param n
   */
  public static void merge(int[] A, int m, int[] B, int n) {
    int i = m + n - 1; // 当前位置指针
    int j = m - 1; // 数组A当前数字指针
    int k = n - 1; // 数组B当前数字指针

    // 从高位开始比较
    while (i >= 0) {
      if (j >= 0 && k >= 0) {
        if (A[j] >= B[k]) {
          A[i] = A[j];
          j--;
        } else {
          A[i] = B[k];
          k--;
        }
      } else if (j > 0) {
        A[i] = A[j];
        j--;
      } else if (k > 0) {
        A[i] = B[k];
        k--;
      }
      i--;
    }
  }

  public static void main(String[] args) {
    int[] A = {1, 2, 4, 5, 6, 0, 0, 0, 0, 0};
    int[] B = {2, 3, 7, 8, 10};

    MergeSortedArray.merge(A, 5, B, 5);
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }
  }
}
