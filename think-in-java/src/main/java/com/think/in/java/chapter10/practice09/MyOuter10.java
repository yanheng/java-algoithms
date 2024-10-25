package com.think.in.java.chapter10.practice09;

import com.think.in.java.chapter10.practice06.one.MyInterface;

public class MyOuter10 {

  public MyInterface getMyInterface(boolean b, String s) {
    if (b) {
      return new MyInterface() {
        @Override
        public void name() {
          System.out.println(s);
        }
      };
    }
    return null;
  }

  public static void main(String[] args) {
    MyOuter10 outer09 = new MyOuter10();
    outer09.getMyInterface(true, "SS").name();
  }
}
