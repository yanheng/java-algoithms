package com.think.in.java.chapter07.example08.demo02;

public class BlankFinal {

  private final int i = 0;

  private final int j;


  private final Poppet p;

  BlankFinal() {
    j = 1;
    p = new Poppet(1);
  }

  BlankFinal(int x) {
    j = x;
    p = new Poppet(x);
  }


  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
}
