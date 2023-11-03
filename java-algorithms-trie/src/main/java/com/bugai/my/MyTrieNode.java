package com.bugai.my;

public class MyTrieNode {
  public MyTrieNode slot[] = new MyTrieNode[26];

  public char c;

  public String word;

  public int prefix;

  public boolean isWord;

  public String explain;
}
