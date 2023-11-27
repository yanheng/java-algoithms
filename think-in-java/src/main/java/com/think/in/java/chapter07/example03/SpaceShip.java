package com.think.in.java.chapter07.example03;

public class SpaceShip extends SpaceShipControls {
  private String name;

  public SpaceShip(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "SpaceShip{" +
            "name='" + name + '\'' +
            '}';
  }

  public static void main(String[] args) {
    SpaceShip spaceShip = new SpaceShip("NSEA Protector");
    spaceShip.forward(100);
  }
}
