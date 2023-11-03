package com.bugai.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicates2Test {

  @Test
  public void testRemoveDuplicates() {
    int a[] = new int[]{1, 1, 2, 2, 2, 3};

    int i = RemoveDuplicates2.removeDuplicates(a, 6);

    assertEquals(5, i);

    for (int j = 0; j < 5; j++) {
      System.out.println(a[j]);
    }
  }
}