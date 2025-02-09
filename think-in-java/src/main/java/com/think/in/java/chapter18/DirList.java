package com.think.in.java.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter {
  private Pattern pattern;

  public DirFilter(String regex) {
    this.pattern = Pattern.compile(regex);
  }

  @Override
  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches();
  }
}

public class DirList {

  public static FilenameFilter filter(final String regex) {
    return new FilenameFilter() {
      private Pattern pattern = Pattern.compile(regex);

      @Override
      public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
      }
    };
  }

  public static void main(String[] args) {
    File path = new File(".");

    String[] list;
    if (args.length == 0) {
      list = path.list();
    } else {
      list = path.list(filter(args[0]));

    }
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
