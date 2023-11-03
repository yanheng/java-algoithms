package com.bugai.leetcode;

/**
 * Given a sorted array, remove the duplicates in place such that > each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array A = [1,1,2],
 * <p>
 * Your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicates {

  public static int removeDuplicates(int A[], int n) {

    if (n == 0) {
      return 0;
    }

    int uniqueLength = 1;
    int currentNum = A[0];
    for (int i = 1; i < n; i++) {
      if (currentNum != A[i]) {
        currentNum = A[i];
        A[uniqueLength] = currentNum;
        uniqueLength++;
      }
    }
    return uniqueLength;
  }

}
