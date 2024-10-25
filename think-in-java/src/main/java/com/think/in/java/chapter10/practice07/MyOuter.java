package com.think.in.java.chapter10.practice07;

public class MyOuter {
  private String name = "zhangsan";

  private void setName(String name) {
    this.name = name;
    System.out.println(this.name);
  }

  class Inner {

    private int i = 0;

    public void updateName() {
      name = "lisi";
      setName(name);
    }
  }

  public Inner inner() {
    return new Inner();
  }

  public static void main(String[] args) {
    MyOuter outer = new MyOuter();
    outer.inner().updateName();
  }

}
