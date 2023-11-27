package com.think.in.java.chapter07.example04.demo01;

public class PlaceSetting extends Custom {

  private Spoon sp;
  private Fork fk;
  private Knife kf;
  private DinnerPlate pl;

  PlaceSetting(int i) {
    super(i + 1);
    sp = new Spoon(i + 2);
    fk = new Fork(i + 3);
    kf = new Knife(i + 4);
    pl = new DinnerPlate(i + 5);
    System.out.println("Place constructor");
  }

  public static void main(String[] args) {
    PlaceSetting x = new PlaceSetting(9);

  }
}
