package com.bugai.reflection.demo02;

import java.io.Serializable;

public class MyObject implements Serializable {

  public final static int x = 0;

  public String filed01;

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
