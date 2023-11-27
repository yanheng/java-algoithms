package com.think.in.java.chapter07.practice;

public class Component1 {

  private int x;

  Component1() {
    x = 0;
    System.out.println("Component1() x=" + this.x);
  }

  Component1(int x) {
    this.x = x;
    System.out.println("Component1() x=" + this.x);
  }

  public void dispose(){
    System.out.println("Component1 dispose()");
  }

}
