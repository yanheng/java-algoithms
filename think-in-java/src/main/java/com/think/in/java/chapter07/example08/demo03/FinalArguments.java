package com.think.in.java.chapter07.example08.demo03;

public class FinalArguments {

  void with(final Gizmo g) {
    //    g = new Gizmo();
  }

  void without(Gizmo g) {
    g = new Gizmo();
    g.spin();
  }

  void f(final int i) {
    //    i++;
  }

  int g(final int i) {
    return i + 1;
  }

  public static void main(String[] args) {
    FinalArguments finalArguments = new FinalArguments();
    finalArguments.with(null);
    finalArguments.without(null);
  }
}
