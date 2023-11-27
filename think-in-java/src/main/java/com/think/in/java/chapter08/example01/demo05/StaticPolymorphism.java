package com.think.in.java.chapter08.example01.demo05;

public class StaticPolymorphism {

  public static void main(String[] args) {
    StaticSuper staticSuper = new StaticSub();

    System.out.println(staticSuper.staticGet());
    System.out.println(staticSuper.dynamicGet());
  }
}
