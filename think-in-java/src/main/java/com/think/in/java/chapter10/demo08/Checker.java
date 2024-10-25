package com.think.in.java.chapter10.demo08;

public class Checker implements Game {

  private Checker() {

  }

  private int moves = 0;

  private static final int MOVES = 3;

  @Override
  public boolean move() {
    System.out.println("Checker move " + moves);
    return ++moves != MOVES;
  }

  public static GameFactory factory = new GameFactory() {
    @Override
    public Game getGame() {
      return new Checker();
    }
  };
}
