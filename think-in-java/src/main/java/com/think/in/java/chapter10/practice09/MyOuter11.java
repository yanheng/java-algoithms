package com.think.in.java.chapter10.practice09;

import com.think.in.java.chapter10.practice06.one.MyInterface;

public class MyOuter11 {


  private class Inner implements MyInterface {

    @Override
    public void name() {
      System.out.println("hello world");
    }
  }

  public MyInterface getInner() {
    return new Inner();
  }

  public static void main(String[] args) {
    MyOuter11 outer11 = new MyOuter11();
    outer11.getInner().name();
  }
}
