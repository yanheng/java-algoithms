package com.bugai.leetcode;

/**
 * Follow up for “Remove Duplicates”:
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDuplicates2 {

  public static int removeDuplicates(int A[], int n) {
    if (n == 0) {
      return 0;
    }

    int currentNum = A[0];
    int length = 1;
    int count = 0;
    for (int i = 1; i < n; i++) {

      if (currentNum == A[i]) {
        count++;
        if (count < 2) {
          A[length++] = A[i];
        }
      } else {
        A[length++] = A[i];
        count = 0;
        currentNum = A[i];
      }

    }
    return length;
  }

}
