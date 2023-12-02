package com.think.in.java.chapter09.practice05.pg02;

import com.think.in.java.chapter09.practice05.pg01.MyInterface;

public class MyObject implements MyInterface {
  @Override
  public void fun1() {
    System.out.println("fun1");
  }

  @Override
  public String fun2() {
    return "fun2";
  }

  @Override
  public Integer fun3() {
    return Integer.MAX_VALUE;
  }

  public static void main(String[] args) {
    MyInterface myInterface = new MyObject();
    myInterface.fun1();
    System.out.println(myInterface.fun2());
    System.out.println(myInterface.fun3());
  }
}
