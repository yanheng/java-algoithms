package com.think.in.java.chapter08.example01.demo04;

public class Sub extends Super {

  public int field = 1;

  @Override
  public int getField() {
    return field;
  }

  public int getSuperField() {
    return super.field;
  }
}
