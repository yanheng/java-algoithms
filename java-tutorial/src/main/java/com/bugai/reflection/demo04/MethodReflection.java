package com.bugai.reflection.demo04;

import com.bugai.reflection.common.MyObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class MethodReflection {

  public static void main(String[] args) {
    Class myObjectClass = MyObject.class;
    Method[] methods = myObjectClass.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }

    try {
      Method show = myObjectClass.getMethod("show", String.class);

      Class<?> returnType = show.getReturnType();
      System.out.println(returnType.getName());
      Class<?>[] parameterTypes = show.getParameterTypes();
      for (Class<?> parameterType : parameterTypes) {
        System.out.println(parameterType.getName());
      }

      Type genericReturnType = show.getGenericReturnType();
      System.out.println("type " + genericReturnType.getTypeName());

      MyObject object = new MyObject();

      Object bob = show.invoke(object, "Bob");




    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
