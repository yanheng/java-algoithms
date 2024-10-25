package com.think.in.java.chapter10.demo07;

public class Implementation2 implements Service {

  public static ServiceFactory factory = new ServiceFactory() {
    @Override
    public Service getService() {
      return new Implementation2();
    }
  };

  @Override
  public void method1() {
    System.out.println("Implementation2 method1()");
  }

  @Override
  public void method2() {
    System.out.println("Implementation2 method2()");
  }
}
