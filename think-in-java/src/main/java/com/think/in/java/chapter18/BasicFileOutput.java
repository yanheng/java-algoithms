package com.think.in.java.chapter18;

import java.io.*;

public class BasicFileOutput {
  static String file = "BasicFileOutput.java";

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\BasicFileOutput.java")));

    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

    int lineCount = 1;
    String s;
    while ((s = in.readLine()) != null) {
      out.println(lineCount ++ + ": " + s);
    }
    out.close();
  }
}
