package com.think.in.java.chapter08.example01.demo05;

public class StaticSub extends StaticSuper {

  public static String staticGet() {
    return "Derived staticGet()";
  }

  @Override
  public String dynamicGet() {
    return "Derived dynamicGet()";
  }
}
