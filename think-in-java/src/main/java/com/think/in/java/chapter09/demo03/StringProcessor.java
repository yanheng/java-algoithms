package com.think.in.java.chapter09.demo03;

public abstract class StringProcessor implements Processor {

  @Override
  public String name() {
    return getClass().getSimpleName();
  }

  @Override
  public abstract Object process(Object input);

  public static String s = "Hello world";

  public static void main(String[] args) {
    Apply.process(new Downcase(), s);
    Apply.process(new Upcase(), s);
    Apply.process(new Splitter(), s);
    Apply.process(new Reversal(), s);
  }
}
