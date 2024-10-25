package com.think.in.java.chapter11.demo04;

public class Pet {
  private String id;

  public Pet(String id) {
    this.id = id;
  }

  public String id() {
    return this.id;
  }

  @Override
  public String toString() {
    return "Pet{" +
            "id='" + id + '\'' +
            '}';
  }
}
