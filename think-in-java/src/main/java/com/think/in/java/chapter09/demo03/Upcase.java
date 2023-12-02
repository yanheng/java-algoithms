package com.think.in.java.chapter09.demo03;

import java.util.Locale;

public class Upcase extends StringProcessor {

  public String process(Object object) {
    return ((String) object).toUpperCase(Locale.ROOT);
  }
}
