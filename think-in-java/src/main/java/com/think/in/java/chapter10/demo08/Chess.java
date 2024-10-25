package com.think.in.java.chapter10.demo08;

public class Chess implements Game {

  private Chess() {
  }

  private int moves = 0;

  private static final int MOVES = 5;

  @Override
  public boolean move() {
    System.out.println("Chess move " + moves);
    return ++moves != MOVES;
  }

  public static GameFactory factory = new GameFactory() {
    @Override
    public Game getGame() {
      return new Chess();
    }
  };
}
