package org.example;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256]; // ASCII
        for (int i = 0; i < 256; i++) lastIndex[i] = -1;

        int maxLen = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }
            lastIndex[ch] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(str));
    }

}
