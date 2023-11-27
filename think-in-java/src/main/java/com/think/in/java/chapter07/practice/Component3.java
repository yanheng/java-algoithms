package com.think.in.java.chapter07.practice;

public class Component3 {

  int x;

  Component3() {
    System.out.println("Component3() x=" + this.x);
  }


  Component3(int x) {
    this.x = x;
    System.out.println("Component3() x=" + this.x);
  }

  public void dispose(){
    System.out.println("Component3 dispose()");
  }
}
