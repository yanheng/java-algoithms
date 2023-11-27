package com.think.in.java.chapter07.example03;

public class SpaceShipDelegation {
  private String name;

  private SpaceShipControls controls = new SpaceShipControls();

  public SpaceShipDelegation(String name) {
    this.name = name;
  }

  public void up(int velocity) {
    this.controls.up(velocity);
  }

  public void down(int velocity) {
    this.controls.down(velocity);
  }

  public void left(int velocity) {
    this.controls.left(velocity);
  }

  public void right(int velocity) {
    this.controls.right(velocity);
  }

  public void forward(int velocity) {
    this.controls.forward(velocity);
  }

  public void back(int velocity) {
    this.controls.back(velocity);
  }

  public void turboBoost() {
    this.controls.turboBoost();
  }
}
