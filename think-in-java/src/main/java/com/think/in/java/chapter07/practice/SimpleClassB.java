package com.think.in.java.chapter07.practice;

public class SimpleClassB {

  private SimpleClassA classA;

  public SimpleClassB() {
    System.out.println("SimpleClassB()");
  }

  @Override
  public String toString() {
    if (classA == null) {
      classA = new SimpleClassA();
    }
    return "SimpleClassB{" +
            "classA=" + classA +
            '}';
  }

  public static void main(String[] args) {
    SimpleClassB classB = new SimpleClassB();
    System.out.println(classB);
  }
}
