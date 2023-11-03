package com.bugai.leetcode;

/**
 * 无序数组，去掉重复数据
 */
public class RemoveDuplicates1 {


  public static int removeDuplicates(int A[], int n) {
    if (n == 0) {
      return 0;
    }

    int length = 1;
    boolean exist = false;
    for (int i = 1; i < n; i++) {

      for (int j = 0; j < i; j++) {
        if (A[j] == A[i]) {
          exist = true;
        }
      }

      if (!exist) {
        A[length++] = A[i];
      }
      exist = false;
    }
    return length;
  }
}
