package com.think.in.java.chapter09.demo07;

public class Implementation2Factory implements ServiceFactory {
  @Override
  public Service getService() {
    return new Implementation2();
  }
}
