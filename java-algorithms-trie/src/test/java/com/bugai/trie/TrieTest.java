package com.bugai.trie;

import com.alibaba.fastjson.JSON;
import com.bugai.my.MyTrie;
import com.bugai.my.MyTrieNode;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


class TrieTest {

  Logger logger = LoggerFactory.getLogger(TrieNode.class);

  @Test
  public void test_trie() {
    MyTrie trie = new MyTrie();
    // 存入
    trie.insert("bat","大厂");
    trie.insert("batch", "批量");
    trie.insert("bitch", "彪子");
    trie.insert("battle", "战斗");
    logger.info(trie.toString());
    // 检索
    List<String> trieNodes = trie.searchPrefix("bat");
    logger.info("测试结果：{}", trieNodes);
  }

}