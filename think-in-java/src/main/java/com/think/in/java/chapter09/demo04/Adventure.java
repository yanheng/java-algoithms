package com.think.in.java.chapter09.demo04;

public class Adventure {
  public static void t(CanFight x) {
    x.fight();
  }

  public static void u(CanSwim x) {
    x.swim();
  }

  public static void w(CanFly x) {
    x.fly();
  }

  public static void v(ActionCharacter x) {
    x.fight();
  }

  public static void c(CanClimb x) {
    x.climb();
  }

  public static void main(String[] args) {
    Hero h = new Hero();
    t(h);
    u(h);
    w(h);
    v(h);
    c(h);
  }
}
