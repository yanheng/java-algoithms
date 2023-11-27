package com.think.in.java.chapter07.practice;

public class TestC extends TestA {

  public TestC() {
    super("A");
    System.out.println("TestC constructor");
  }

  private TestB testB = new TestB("B");


  public static void main(String[] args) {
    TestC c = new TestC();

  }
}
