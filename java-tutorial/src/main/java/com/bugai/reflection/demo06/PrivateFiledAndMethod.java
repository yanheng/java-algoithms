package com.bugai.reflection.demo06;

import com.bugai.reflection.common.PrivateObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateFiledAndMethod {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    PrivateObject privateObject = new PrivateObject("The Private Value");

    Field privateString =
            PrivateObject.class.getDeclaredField("privateString");

    privateString.setAccessible(true);
    String fieldValue = (String) privateString.get(privateObject);

    System.out.println("fieldValue = " + fieldValue);

    Method getPrivateString = PrivateObject.class.getDeclaredMethod("getPrivateString");
    getPrivateString.setAccessible(true);
    String returnValue = (String) getPrivateString.invoke(privateObject);
    System.out.println("returnValue = " + returnValue);


  }

}
