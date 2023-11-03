package com.bugai.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

  @Test
  void removeElement() {

    int a[] = new int[]{1, 2, 2, 3, 2, 4};
    RemoveElement element = new RemoveElement();
    int i = element.removeElement(a, 6, 2);

    Assertions.assertEquals(3, i);
  }

  @Test
  void removeElement_empty() {
    int a[] = new int[]{};
    RemoveElement element = new RemoveElement();
    int i = element.removeElement(a, 0, 2);

    Assertions.assertEquals(0, i);
  }
}