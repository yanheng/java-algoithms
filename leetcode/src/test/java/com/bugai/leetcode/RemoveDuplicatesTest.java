package com.bugai.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

  @Test
  public void testRemoveDuplicates() {
    int a[] = new int[]{1, 1, 2, 2, 2, 3};

    int i = RemoveDuplicates.removeDuplicates(a, 6);

    Assertions.assertEquals(3, i);

    for (int j = 0; j < 3; j++) {
      System.out.println(a[j]);
    }
  }
}