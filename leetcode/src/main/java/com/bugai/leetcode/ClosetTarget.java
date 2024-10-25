package com.bugai.leetcode;

/**
 * 到目标字符串的最短距离
 * 给你一个下标从 0 开始的 环形 字符串数组 words 和一个字符串 target 。环形数组 意味着数组首尾相连。
 *
 * 形式上， words[i] 的下一个元素是 words[(i + 1) % n] ，而 words[i] 的前一个元素是 words[(i - 1 + n) % n] ，其中 n 是 words 的长度。
 * 从 startIndex 开始，你一次可以用 1 步移动到下一个或者前一个单词。
 *
 * 返回到达目标字符串 target 所需的最短距离。如果 words 中不存在字符串 target ，返回 -1 。
 */
public class ClosetTarget {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int i = startIndex;
        int j = startIndex;
        int cnt = 0;
        while (true) {
            if (words[i].equals(target) || words[j].equals(target)) {
               return cnt;
            }
            cnt++;
            i = (i + 1) % n;
            j = (j - 1 + n) % n;
            if (cnt > n) {
                return -1;
            }
        }
    }
}
