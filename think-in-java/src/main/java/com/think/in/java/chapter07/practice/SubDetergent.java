package com.think.in.java.chapter07.practice;

import com.think.in.java.chapter07.example02.Detergent;

public class SubDetergent extends Detergent {

  public void scrub() {
    cleanser.append(" SubDetergent.scrub()");
  }

  public void sterilize(){
    cleanser.append(" sterilize()");
  }

  public static void main(String[] args) {
    SubDetergent x = new SubDetergent();
    x.scrub();
    x.foam();
    x.sterilize();

    System.out.println(x);
  }
}
