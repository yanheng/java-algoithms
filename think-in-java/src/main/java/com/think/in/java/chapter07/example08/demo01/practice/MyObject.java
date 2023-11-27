package com.think.in.java.chapter07.example08.demo01.practice;

/**
 * static final的通过类名称访问
 * <p>
 * final域不能通过类名称访问
 */
public class MyObject {

  public static final String VALUE = "HELLO";

  public final String ATTR = "BOB";


  public static void main(String[] args) {
    System.out.println(MyObject.VALUE);

  }
}
