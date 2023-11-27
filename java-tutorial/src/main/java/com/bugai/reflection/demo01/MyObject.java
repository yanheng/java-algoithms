package com.bugai.reflection.demo01;

public class MyObject {

  private int x = 0;

  private String filed01;

  public String getFiled01() {
    return filed01;
  }

  public void setFiled01(String filed01) {
    this.filed01 = filed01;
  }

  public void function() {
    System.out.println("function() execute");
  }
}
