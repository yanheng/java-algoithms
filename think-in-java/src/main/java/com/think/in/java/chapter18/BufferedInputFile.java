package com.think.in.java.chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
  public static String read(String filename) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(filename));
    String s;

    StringBuilder sb = new StringBuilder();
    while ((s = in.readLine()) != null) {
      sb.append(s + "\n");
    }
    in.close();
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    System.out.println(read("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\BufferedInputFile.java"));
  }
}
