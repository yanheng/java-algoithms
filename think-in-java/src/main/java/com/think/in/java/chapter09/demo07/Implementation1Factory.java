package com.think.in.java.chapter09.demo07;

public class Implementation1Factory implements ServiceFactory {
  @Override
  public Service getService() {
    return new Implementation1();
  }
}
