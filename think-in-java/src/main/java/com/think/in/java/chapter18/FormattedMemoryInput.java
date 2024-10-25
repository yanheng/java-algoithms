package com.think.in.java.chapter18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
  public static void main(String[] args) throws IOException {
    DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\FormattedMemoryInput.java").getBytes()));
    while (in.available() != 0) {
      System.out.print((char) in.readByte());
    }
  }
}
