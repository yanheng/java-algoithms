package com.bugai.reflection.demo02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Example01 {
  public static void main(String[] args) {

    try {
      Class<MyObject> myObjectClass = MyObject.class;
      Class<?> aClass = Class.forName("com.bugai.reflection.demo02.MyObject");
      // 是同一个对象
      System.out.println(myObjectClass == aClass);

      System.out.println(aClass.getName());
      System.out.println(aClass.getSimpleName());
      System.out.println(aClass.getSigners());
      System.out.println(Modifier.isPublic(aClass.getModifiers()));
      System.out.println(aClass.getPackage());

      System.out.println("===============");
      Field[] fields = aClass.getFields();
      for (Field field : fields) {
        int modifiers = field.getModifiers();
        System.out.println("field name: " + field.getName());
        System.out.println("isPublic() :" + Modifier.isPublic(modifiers));
        System.out.println("isStatic() :" + Modifier.isStatic(field.getModifiers()));
        System.out.println("isFinal() :" + Modifier.isFinal(field.getModifiers()));
        System.out.println("isFinal() :" + Modifier.isPrivate(field.getModifiers()));
        System.out.println("==============");
      }

      Class<?> superclass = aClass.getSuperclass();
      System.out.println("superclass : " + superclass.getName());

      Class<?>[] interfaces = aClass.getInterfaces();

      for (Class<?> anInterface : interfaces) {
        System.out.println("anInterface :" + anInterface.getName());
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
