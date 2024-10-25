package com.think.in.java.chapter10.practice06.three;

import com.think.in.java.chapter10.practice06.one.MyInterface;
import com.think.in.java.chapter10.practice06.two.MyOuter;

public class MyOuterSubClass extends MyOuter {

  public MyInterface myInterface() {

    return new MyInner("zhangsan");
  }

  public static void main(String[] args) {
    MyInterface myInterface = new MyOuterSubClass().myInterface();
    myInterface.name();

  }
}
