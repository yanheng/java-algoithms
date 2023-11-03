package com.bugai.leetcode;

/**
 * Given an array and a value, remove all instances of that > value in place and return the new length.
 * <p>
 * The order of elements can be changed. It doesn’t matter what you leave beyond the new length.
 */
public class RemoveElement {


  public int removeElement(int A[], int n, int element) {
    int j = 0;

    for (int i = 0; i < n; i++) {
      if (A[i] == element) {
        continue;
      }
      A[i] = A[j++];
    }
    return j;
  }
}
