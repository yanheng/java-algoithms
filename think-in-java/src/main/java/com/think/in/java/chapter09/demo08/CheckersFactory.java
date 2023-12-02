package com.think.in.java.chapter09.demo08;

public class CheckersFactory implements GameFactory {
  @Override
  public Game getGame() {
    return new Checkers();
  }
}
