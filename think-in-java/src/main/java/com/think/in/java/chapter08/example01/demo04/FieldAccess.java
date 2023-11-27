package com.think.in.java.chapter08.example01.demo04;

public class FieldAccess {

  public static void main(String[] args) {
    Super sub = new Sub();

    System.out.println("sub.field = " + sub.field +
            ", sub.getFiled() = " + sub.getField());

    Sub sub1 = new Sub();


    System.out.println("sub1.field = " + sub1.field +
            ", sub1.getFiled() = " + sub1.getField() +
            ", sub1.getSuperField() = " + sub1.getSuperField());

  }
}
