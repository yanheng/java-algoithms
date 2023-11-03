package com.algoithms.hashmap;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class HashMap04ByCoalescedHashingTest {

  Logger logger = LoggerFactory.getLogger(HashMap04ByCoalescedHashingTest.class);

  @Test
  void test_hashMap04() {
    Map map = new HashMap04ByCoalescedHashing();
    map.put("01", "花花");
    map.put("02", "豆豆");

    map.put("09", "蛋蛋");
    map.put("12", "苗苗");



  }

}