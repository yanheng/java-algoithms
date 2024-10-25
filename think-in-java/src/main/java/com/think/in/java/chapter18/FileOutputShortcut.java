package com.think.in.java.chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
  static String file = "FileOutputShortcut.java";

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\FileOutputShortcut.java")));
    PrintWriter out = new PrintWriter(file);
    int lineCount = 1;

    String s;
    while ((s = in.readLine()) != null) {
      out.println(lineCount++ + ": " + s);
    }
    out.close();
  }
}
