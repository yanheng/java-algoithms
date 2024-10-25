package com.think.in.java.chapter18;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
  public static String read(String fileName) throws IOException {
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
      try {
        String s;
        while ((s = in.readLine()) != null) {
          sb.append(s);
          sb.append("\n");
        }
      } finally {
        in.close();
      }
    } catch (IOException e) {
      throw new RuntimeException();
    }
    return sb.toString();
  }

  public static void write(String fileName, String text) {
    try {
      PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
      try {
        out.println(text);
      } finally {
        out.close();
      }
    } catch (IOException e) {
      throw new RuntimeException();
    }
  }

  public TextFile(String fileName, String splitter) throws IOException {
    super(Arrays.asList(read(fileName).split(splitter)));
    if (get(0).equals("")) {
      remove(0);
    }
  }

  public TextFile(String fileName) throws IOException {
    this(fileName, "\n");
  }

  public void write(String fileName) {
    try {
      PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
      try {
        for (String item : this) {
          out.println(item);
        }
      } finally {
        out.close();
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException();
    }
  }

  public static void main(String[] args) throws IOException {
    String file = read("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\TextFile.java");
    write("text.txt", file);
    TreeSet<String> words = new TreeSet<>(new TextFile("E:\\workspace\\github\\java-algoithms\\think-in-java\\src\\main\\java\\com\\think\\in\\java\\chapter18\\TextFile.java", "\\W+"));
    System.out.println(words.headSet("a"));
  }
}
