package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {

    //Problem Statement: Write a function to find the longest common prefix
    // string amongst an array of strings. If there is no common prefix,
    // return an empty string "".

//    Example 1
//    Input: str = ["flower", "flow", "flight"]
//    Output: "fl"
//    Explanation: All strings in the array begin with the common prefix "fl".
//
//    Example 2
//    Input: str = ["apple", "banana", "grape", "mango"]
//    Output: ""
//    Explanation: None of the strings share a common starting sequence, so the result is an empty string.


    public static String longestCommonPrefix(String v[]){
        StringBuilder ans = new StringBuilder();

        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];

        for (int i=0; i< Math.min(first.length() , last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String args[]){
        String[] input = {"interview", "internet", "internal", "interval"};
        String result = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }

}
