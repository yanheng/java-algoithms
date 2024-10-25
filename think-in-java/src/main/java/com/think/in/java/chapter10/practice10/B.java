package com.think.in.java.chapter10.practice10;

public class B {
  U[] us;

  public void init(U[] us) {
    this.us = us;
  }

  public void dispose() {
    this.us = null;
  }

  public void list() {
    if (us != null) {
      for (U u : us) {
        u.f1();
        u.f2();
        u.f3();
      }
    }
  }

  public static void main(String[] args) {
    U[] us = new U[3];
    for (int i = 0; i < us.length; i++) {
      us[i] = new A().x();
    }

    B b = new B();
    b.init(us);
    b.list();
    b.dispose();
  }

}
