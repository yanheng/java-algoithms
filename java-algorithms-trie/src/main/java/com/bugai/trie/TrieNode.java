package com.bugai.trie;

public class TrieNode {

  public TrieNode[] slot = new TrieNode[26];

  public char c;

  public boolean isWord;

  public int prefix;

  public String word;

  public String explain;
}
