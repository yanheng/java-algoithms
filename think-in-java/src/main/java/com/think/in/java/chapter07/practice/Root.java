package com.think.in.java.chapter07.practice;

public class Root {
  private Component1 component1 = new Component1(1);

  private Component2 component2 = new Component2(2);

  private Component3 component3 = new Component3(3);

  int x;

  public Root() {
    System.out.println("Root constructor " + this.x);
  }

  public Root(int x) {
    this.x = x;
    System.out.println("Root constructor x = " + this.x);
  }

  public void dispose(){
    component1.dispose();
    component2.dispose();
    component3.dispose();
    System.out.println("Root dispose()");
  }

}
