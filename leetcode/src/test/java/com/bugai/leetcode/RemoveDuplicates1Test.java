package com.bugai.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicates1Test {

  @Test
  public void testRemoveDuplicates_sorted() {
    int a[] = new int[]{1, 1, 2, 2, 2, 3};

    int i = RemoveDuplicates1.removeDuplicates(a, 6);

    Assertions.assertEquals(3, i);

    for (int j = 0; j < 3; j++) {
      System.out.println(a[j]);
    }
  }

  @Test
  public void testRemoveDuplicates_not_sorted() {
    int a[] = new int[]{1, 1, 3, 2, 2, 2};

    int i = RemoveDuplicates1.removeDuplicates(a, 6);

    Assertions.assertEquals(3, i);

    for (int j = 0; j < 3; j++) {
      System.out.println(a[j]);
    }
  }
}