package com.think.in.java.chapter09.practice16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChar extends RandomChars implements Readable {

  private int count;

  public AdaptedRandomChar(int count) {
    this.count = count;
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    if (count-- == 0) {
      return -1;
    }
    cb.append(next());
    cb.append(" ");
    return cb.length();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(new AdaptedRandomChar(7));
    while (s.hasNext()) {
      System.out.println(s.next());
    }
  }
}
