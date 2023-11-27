package com.bugai.reflection.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example01 {

  public static void main(String[] args) {
    Method[] methods = MyObject.class.getMethods();
    for (Method method : methods) {
      System.out.println("method = " + method.getName());
    }

    Field[] fields = MyObject.class.getFields();
    for (Field field : fields) {
      System.out.println("field = " + field.getName());
    }
  }

}
