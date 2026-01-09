package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrintallthepossiblesubsequencesoftheStringUsingRecursion {

    //Input: str = "abc"
    //Output: [a, ab, abc, ac, b, bc, c]
    //Explanation: Given string has 7 subsequences.
    //Input: str = "aa"
    //Output: [a, a, aa]
    //Explanation: Given string has 3 subsequences.

    public static List<String> getSubsequence(String s){
        int n = s.length();
        int total = 1<< n;
        List<String> subsequences = new ArrayList<>();

        for(int mask = 0;mask < total;mask++){
            StringBuilder subseq = new StringBuilder();
            for(int i=0;i<n;i++){
                if((mask & (1 <<i)) != 0){
                    subseq.append(s.charAt(i));
                }
            }
            subsequences.add(subseq.toString());
        }
        return subsequences;

    }

    public static void main(String[] args) {
        // Input string
        String s = "abcd";

        // Get all subsequences
        List<String> subsequences = getSubsequence(s);

        // Print all subsequences
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }

        // Print count
        System.out.println("Total subsequences = " + subsequences.size());
    }

}
