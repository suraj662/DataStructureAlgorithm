package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofSubstrings {

    //Example 1:
    //Input: s = "pqpqs", k = 2
    //Output: 7
    //Explanation:  All substrings with exactly 2 distinct characters:
    //"pq", "pqp", "pqpq", "qp", "qpq", "pqs", "qs"
    //Total = 7.
    //
    //Example 2:
    //Input: s = "abcbaa", k = 3
    //Output: 5
    //Explanation:  All substrings with exactly 3 distinct characters:
    //"abc", "abcb", "abcba", "bcba", "cbaa"
    //Total = 5.

    public static int atMostKDistinct(String s, int k){
        int left=0 ,res = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for(int right =0; right < s.length(); right++){
            freq.put(s.charAt(right) , freq.getOrDefault(s.charAt(right),0)+ 1);

            while(freq.size() > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar , freq.get(leftChar) - 1);
                if(freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }
    public static int countSubstrings(String s, int k) {
        return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
    }

    public static void main(String[] args) {
        // Sample test
        String s = "pqpqs";
        int k = 2;

        // Output the result
        System.out.println("Count: " + countSubstrings(s, k)); // Output: 7
    }


}
