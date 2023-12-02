package com.think.in.java.chapter09.demo07;

public class Factory {
  public static void serviceConsumer(ServiceFactory fact) {
    Service service = fact.getService();
    service.method1();
    service.method2();
  }

  public static void main(String[] args) {
    serviceConsumer(new Implementation1Factory());
    serviceConsumer(new Implementation2Factory());
  }
}
