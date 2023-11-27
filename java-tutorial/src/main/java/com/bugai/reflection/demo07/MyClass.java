package com.bugai.reflection.demo07;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnotation(name = "bob", value = "Hello world")
public class MyClass {

  @MyAnnotation(name = "someName", value = "someValue")
  public int doSomething(@MyAnnotation(name="aName", value="aValue") int x) {
    return x + 1;
  }


  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Class myClass = MyClass.class;

    Annotation[] annotations = myClass.getAnnotations();
    for (Annotation annotation : annotations) {
      if (annotation instanceof MyAnnotation) {
        MyAnnotation myAnnotation = (MyAnnotation) annotation;
        System.out.println(myAnnotation.name());
        System.out.println(myAnnotation.value());
      }
    }

    MyAnnotation annotation = (MyAnnotation) myClass.getAnnotation(MyAnnotation.class);
    System.out.println(annotation.name());
    System.out.println(annotation.value());

    MyClass myClass1 = new MyClass();
    Method[] methods = myClass.getMethods();
    for (Method method : methods) {
      Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
      for (Annotation declaredAnnotation : declaredAnnotations) {
        System.out.println(declaredAnnotation.annotationType().getName());
        if (declaredAnnotation instanceof MyAnnotation) {
          MyAnnotation myAnnotation = (MyAnnotation) declaredAnnotation;
          System.out.println(myAnnotation.value());
          System.out.println(myAnnotation.name());
          if (myAnnotation.name().equals("someName")) {
            int invoke = (int) method.invoke(myClass1, 4);
            int result = invoke + 2;
            System.out.println(result);
          }
        }
      }

      System.out.println("===========================");
      Annotation[][] parameterAnnotations = method.getParameterAnnotations();

      for (Annotation[] parameterAnnotation : parameterAnnotations) {
        for (Annotation annotation1 : parameterAnnotation) {
          System.out.println(annotation1.annotationType().getName());
        }
      }
    }



  }
}
