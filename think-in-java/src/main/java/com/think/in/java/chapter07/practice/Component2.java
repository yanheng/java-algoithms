package com.think.in.java.chapter07.practice;

public class Component2 {

  private int x;

  Component2() {
    System.out.println("Component2() x=" + this.x);
  }

  Component2(int x) {
    this.x = x;
    System.out.println("Component2() x=" + this.x);
  }

  public void dispose(){
    System.out.println("Component2 dispose()");
  }
}
