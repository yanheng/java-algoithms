package com.bugai.reflection.demo10;

public class MyInterfaceObject implements MyInterface {
  @Override
  public void sayHello(String name) {
    System.out.println("Hello " + name);
  }
}
