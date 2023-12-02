package com.think.in.java.chapter09.demo08;

public class Games {
  public static void playGame(GameFactory factory) {
    Game game = factory.getGame();

    while (game.move());
  }

  public static void main(String[] args) {
    playGame(new CheckersFactory());
    playGame(new ChessFactory());
  }
}
