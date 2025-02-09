package com.think.in.java.chapter09.demo06;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDouble extends RandomDoubles implements Readable {

  private int count;

  public AdaptedRandomDouble(int count) {
    this.count = count;
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    if (count-- == 0) {
      return -1;
    }
    String result = Double.toString(next()) + " ";
    cb.append(result);
    return result.length();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(new AdaptedRandomDouble(7));
    while (s.hasNext()) {
      System.out.print(s.nextDouble() + " ");
    }

  }
}
