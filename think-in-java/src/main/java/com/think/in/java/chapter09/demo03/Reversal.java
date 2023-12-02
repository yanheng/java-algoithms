package com.think.in.java.chapter09.demo03;


public class Reversal extends StringProcessor {
  @Override
  public Object process(Object input) {
    char[] chars = ((String) input).toCharArray();
    int start = 0;
    int end = chars.length - 1;
    while (start < end) {
      char temp = chars[end];
      chars[end--] = chars[start++];
      chars[start] = temp;
    }
    return new String(chars);
  }
}
