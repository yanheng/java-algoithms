package com.bugai.reflection.demo08;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class MyClass {

  protected List<String> stringList = Arrays.asList("A", "B", "C");

  public List<String> getStringList() {
    return this.stringList;
  }

  public void setStringList(List<String> stringList) {
    this.stringList = stringList;
  }

  public static void main(String[] args) throws NoSuchMethodException {
    Method method = MyClass.class.getMethod("getStringList", null);
    Type genericReturnType = method.getGenericReturnType();
    if (genericReturnType instanceof ParameterizedType) {
      ParameterizedType type = (ParameterizedType) genericReturnType;
      Type[] actualTypeArguments = type.getActualTypeArguments();
      for (Type actualTypeArgument : actualTypeArguments) {
        Class typeArgClass = (Class) actualTypeArgument;
        System.out.println("typeArgClass = " + typeArgClass);
      }
    }

    Method method1 = MyClass.class.getMethod("setStringList", List.class);
    Type genericReturnType1 = method1.getGenericReturnType();
    if (genericReturnType1 instanceof ParameterizedType) {
      Class typeArgClass = (Class) genericReturnType1;
      System.out.println("typeArgClass = " + typeArgClass);
    }


  }
}
