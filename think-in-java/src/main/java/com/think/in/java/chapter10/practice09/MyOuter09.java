package com.think.in.java.chapter10.practice09;

import com.think.in.java.chapter10.practice06.one.MyInterface;

public class MyOuter09 {

  public MyInterface getMyInterface(String s) {

    return new MyInterface() {

      @Override
      public void name() {
        System.out.println(s);
      }
    };
  }

  public static void main(String[] args) {
    MyOuter09 outer09 = new MyOuter09();
    outer09.getMyInterface("SS").name();
  }
}
