package org.example;

public class LongestPalindromicSubstring {

    //Example 1:
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: It is the longest palindromic substring. "aba" is also a valid answer.
    //
    //Example 2:
    //Input: s = "cbbd"
    //Output: "bb"
    //Explanation: It is the longest palindromic substring.

    public static void main(String args[]) {
        Solution5 sol = new Solution5();
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + sol.longestPalindrome1(input));
    }
}

class Solution5 {
    public static String longestPalindrome1(String str) {
        int start = 0, end = 0;

        // Iterate through each character as center
        for (int center = 0; center < str.length(); center++) {
            // Expand around odd length palindrome
            int lenOdd = expandFromCenter(str, center, center);
            // Expand around even length palindrome
            int lenEven = expandFromCenter(str, center, center + 1);
            // Get the max of both lengths
            int maxLen = Math.max(lenOdd, lenEven);

            // Update the longest palindrome boundaries
            if (maxLen > end - start) {
                start = center - (maxLen - 1) / 2;
                end = center + maxLen / 2;
            }
        }

        // Return the longest palindromic substring
        return str.substring(start, end + 1);
    }

    // Helper function to expand from the center
    private static int expandFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
