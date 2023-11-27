package com.think.in.java.chapter07.example08.demo04;

public class FinalOverridingIllusion {
  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();

    //    OverridingPrivate op = op2;

    WithFinals wf = op2;
    //wf.f()
    //    wf.g();
  }
}
