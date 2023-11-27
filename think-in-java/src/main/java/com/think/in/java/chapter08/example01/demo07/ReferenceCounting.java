package com.think.in.java.chapter08.example01.demo07;

public class ReferenceCounting {

  protected void finalize() {
    System.out.println("finalize");
  }

  public static void main(String[] args) {
    Share share = new Share();

    Composing[] composing = {
            new Composing(share), new Composing(share), new Composing(share)
            , new Composing(share), new Composing(share), new Composing(share)
    };

    for (Composing composing1 : composing) {
      composing1.dispose();
    }

  }
}
