package com.think.in.java.chapter10.demo07;

public class Factories {
  public static void serviceConsumer(ServiceFactory factory) {
    Service service = factory.getService();
    service.method1();
    service.method2();
  }

  public static void main(String[] args) {
    serviceConsumer(Implementation1.factory);
    serviceConsumer(Implementation2.factory);
  }
}
