package com.think.in.java.chapter10.practice06.two;

import com.think.in.java.chapter10.practice06.one.MyInterface;

public class MyOuter {

  protected class MyInner implements MyInterface {

    private String name;

    public MyInner(String name) {
      this.name = name;
    }

    @Override
    public void name() {
      System.out.println(this.name);
    }
  }
}
