package com.think.in.java.chapter17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
  public static <T extends Groundhog> void detectSpring(Class<T> type) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Constructor<T> ghog = type.getConstructor(int.class);
    Map<Groundhog, Prediction> map = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      map.put(ghog.newInstance(i), new Prediction());
    }

    System.out.println("map = " + map);

    Groundhog gh = ghog.newInstance(3);
    System.out.println("Looking up prediction for " + gh);
    if (map.containsKey(gh)) {
      System.out.println(map.containsKey(gh));
    } else {
      System.out.println("key not found: " + gh);
    }
  }

  public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    detectSpring(Groundhog.class);
  }
}
