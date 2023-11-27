package com.think.in.java.chapter08.example01.practice;

public class ApiTest {

  public static void ride(Cycle c) {
    c.show();
    c.balance();
    System.out.println(c.wheels());
  }

  public static void main(String[] args) {
    Cycle cycle = new Cycle();
    ride(cycle);

    Cycle bicycle = new Bicycle();
    ride(bicycle);

    Cycle tricycle = new Tricycle();
    ride(tricycle);

    Cycle unicycle = new Unicycle();
    ride(unicycle);
  }
}
