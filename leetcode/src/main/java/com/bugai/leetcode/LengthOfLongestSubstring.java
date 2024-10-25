package com.bugai.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串的长度。
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        for (; right < n; right++) {
            char c = charArray[right];
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
        int i = substring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(i);
    }
}
