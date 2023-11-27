package com.bugai.reflection.common;

public class MyObject extends AbstractC {

  private int x;


  @Override
  public int getValue() {
    return 0;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}
