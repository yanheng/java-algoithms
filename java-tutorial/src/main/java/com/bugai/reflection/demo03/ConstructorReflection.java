package com.bugai.reflection.demo03;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyObject {
  private int x;

  public MyObject() {
    this.x = 10;
  }

  public MyObject(int x) {
    this.x = x;
  }


  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}

public class ConstructorReflection {

  public static void main(String[] args) {
    Class<MyObject> myObjectClass = MyObject.class;
    Constructor<?>[] constructors = myObjectClass.getConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor.getName());
    }

    try {
      Constructor<MyObject> constructor = myObjectClass.getConstructor(int.class);
      Class<?>[] parameterTypes = constructor.getParameterTypes();
      for (Class<?> parameterType : parameterTypes) {
        System.out.println(parameterType.getName());
      }
      MyObject myObject = constructor.newInstance(100);
      System.out.println(myObject.getX());
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
