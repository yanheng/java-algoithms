package com.bugai.my;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyTrie {

  public final static MyTrieNode wordsTree = new MyTrieNode();

  public final static Integer MAX_LENGTH = 15;

  public void insert(String words, String explain) {
    MyTrieNode root = wordsTree;
    char[] chars = words.toCharArray();
    for (char c : chars) {
      int idx = c - 'a';
      if (root.slot[idx] == null) {
        root.slot[idx] = new MyTrieNode();
      }
      root = root.slot[idx];
      root.c = c;
      root.prefix++;
    }
    root.isWord = true;
    root.explain = explain;
  }

  public List<String> searchPrefix(String prefix) {
    MyTrieNode root = wordsTree;
    char[] chars = prefix.toCharArray();
    StringBuilder cache = new StringBuilder();
    for (char c : chars) {
      int idx = c - 'a';
      if (idx >= root.slot.length || idx < 0 || root.slot[idx] == null) {
        return Collections.emptyList();
      }
      root = root.slot[idx];
      cache.append(root.c);
    }
    List<String> list = new ArrayList<>();
    collectWord(root, String.valueOf(cache), list);
    for (int i = 0; i < root.slot.length; i++) {
      MyTrieNode myTrieNode = root.slot[i];
      if (myTrieNode != null) {
        collect(myTrieNode, String.valueOf(cache) + myTrieNode.c, list);
      }
    }
    return list;
  }

  protected void collect(MyTrieNode trieNode, String pre, List<String> queue) {
    collectWord(trieNode, pre, queue);
    if (queue.size() > MAX_LENGTH) return;

    for (int i = 0; i < trieNode.slot.length; i++) {
      MyTrieNode myTrieNode = trieNode.slot[i];
      if (myTrieNode != null) {
        collect(myTrieNode, pre + myTrieNode.c, queue);
      }
    }
  }

  private void collectWord(MyTrieNode trieNode, String pre, List<String> queue){
    if (trieNode.isWord) {
      trieNode.word = pre;
      queue.add(trieNode.word + " -> " + trieNode.explain);
    }
  }
  @Override
  public String toString() {
    return "Trie：" + JSON.toJSONString(wordsTree);
  }
}
