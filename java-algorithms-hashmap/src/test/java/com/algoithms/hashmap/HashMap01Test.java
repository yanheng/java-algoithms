package com.algoithms.hashmap;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class HashMap01Test {

  Logger logger = LoggerFactory.getLogger(HashMap01Test.class);

  @Test
  void test_hashMap01() {
    Map map = new HashMap01();
    map.put("01", "花花");
    map.put("02", "豆豆");
    logger.info("碰撞前 key：{} value：{}", "01", map.get("01"));

    map.put("09", "蛋蛋");
    map.put("12", "苗苗");
    logger.info("碰撞前 key：{} value：{}", "01", map.get("01"));
  }

}