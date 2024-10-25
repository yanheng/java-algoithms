package com.bugai.leetcode;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!(charArray[left++] == charArray[right--])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean palindrome1 = palindrome.isPalindrome(1);
        System.out.println(palindrome1);
    }
}
