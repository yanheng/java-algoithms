package com.think.in.java.chapter07.example06.practice;

import com.think.in.java.chapter07.example06.Villain;

public class Orc2 extends Villain {

  public Orc2(String name) {
    super(name);
    System.out.println("Orc2");
  }

  public void change(String name) {
    set(name);
    System.out.println("name changed");
  }

  public static void main(String[] args) {
    Villain villain = new Villain("villain");

    System.out.println(villain);

    Orc2 orc2 = new Orc2("Hello");
    System.out.println(orc2);
    orc2.change("word");
    System.out.println(orc2);

  }
}
