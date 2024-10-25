package com.bugai.leetcode;

/**
 * 每种字符至少取 K 个
 * 给你一个由字符 'a'、'b'、'c' 组成的字符串 s 和一个非负整数 k 。每分钟，你可以选择取走 s 最左侧 还是 最右侧 的那个字符。
 * <p>
 * 你必须取走每种字符 至少 k 个，返回需要的 最少 分钟数；如果无法取到，则返回 -1 。
 */
public class TakeCharacters {
    public int takeCharacters(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int[] cnt = new int[3];

        for (char c : charArray) {
            cnt[c - 'a']++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] < k) {
                return -1;
            }
        }

        int left = 0;
        int right = 0;
        int maxLen = 0;
        for (; right < n; right++) {
            char c = charArray[right];
            cnt[c - 'a']--;
            while (left <= right && cnt[c - 'a'] < k) {
                cnt[charArray[left] - 'a']++;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return n - maxLen;
    }

    public static void main(String[] args) {
        TakeCharacters takeCharacters = new TakeCharacters();
        int x = takeCharacters.takeCharacters("aabaaaacaabc", 2);
        System.out.println(x);;
    }
}
