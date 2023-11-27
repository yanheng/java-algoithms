package com.bugai.reflection.common;

public abstract class AbstractC implements MyInterfaceA, MyInterfaceB {


  @Override
  public String show(String name) {
    System.out.println("Show name=" + name);
    return name;
  }
}
