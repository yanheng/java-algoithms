package com.think.in.java.chapter20.demo01;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {

  public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
    Method[] declaredMethods = cl.getDeclaredMethods();
    for (Method method : declaredMethods) {
      UseCase uc = method.getAnnotation(UseCase.class);
      if (uc != null) {
        System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
      }
      useCases.remove(new Integer(uc.id()));
    }

    for (Integer useCase : useCases) {
      System.out.println("Waring: Missing use case-" + useCase);
    }
  }

  public static void main(String[] args) {
    List<Integer> useCase = new ArrayList<>();
    Collections.addAll(useCase, 47, 48, 49, 50);
    trackUseCases(useCase, PasswordUtils.class);
  }
}
