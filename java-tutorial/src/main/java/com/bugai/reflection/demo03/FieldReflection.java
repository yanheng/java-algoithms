package com.bugai.reflection.demo03;


import java.lang.reflect.Field;

class MyFieldObject {
  public String someField = null;
}

public class FieldReflection {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Class<MyFieldObject> myFieldObjectClass = MyFieldObject.class;
    Field[] fields = myFieldObjectClass.getFields();
    for (Field field : fields) {
      System.out.println(field.getName());
    }

    Field someField = myFieldObjectClass.getField("someField");
    System.out.println(someField.getType());

    MyFieldObject fieldObject = new MyFieldObject();
    Object value = someField.get(fieldObject);
    someField.set(fieldObject, "value");
    System.out.println(fieldObject.someField);



  }
}
