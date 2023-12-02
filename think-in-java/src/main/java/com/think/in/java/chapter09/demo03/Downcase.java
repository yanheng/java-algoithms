package com.think.in.java.chapter09.demo03;

import java.util.Locale;

public class Downcase extends StringProcessor {

  public String process(Object input) {
    return ((String) input).toLowerCase(Locale.ROOT);
  }
}
