package com.think.in.java.chapter09.demo03;

import java.util.Arrays;

public class Splitter extends StringProcessor {

  public String process(Object input) {
    return Arrays.toString(((String) input).split(" "));
  }
}
