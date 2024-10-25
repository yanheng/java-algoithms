package com.think.in.java.chapter11.demo04;

import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String> {

  private String filename;
  private String patten;

  public TextFile(String filename, String patten) {
    this.filename = filename;
    this.patten = patten;
  }

  public void readFile() throws FileNotFoundException {
    File file = new File(this.filename);
    FileReader fileReader = new FileReader(file);
  }



}
