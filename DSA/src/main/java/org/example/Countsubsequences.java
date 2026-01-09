package org.example;

import java.util.List;

public class Countsubsequences {

    public static int getcountsubse(String s){
        int n = s.length();
        int total = 1<<n;
        int count =0;

        for (int mask =0;mask < total; mask++){
            StringBuilder subseq = new StringBuilder();
            for (int i=0;i<n;i++){
                if((mask & (1 << i)) != 0){
                    subseq.append(s.charAt(i));
                }
            }
            count++;
        }
        return count;
    }
    //method 2
    public static int countSubsequenc(String s) {
        return (int) Math.pow(2, s.length());
    }
    //method 3
    public static int countSubsequenc1(String s) {
        int count = 0;
        for (int mask = 0; mask < (1 << s.length()); mask++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Input string
        String s = "abc";

        // Get all subsequences
        int result = getcountsubse(s);
        // Print count
        System.out.println("Total count = " + result);
        //method 1
        int res = countSubsequenc(s);
        System.out.println(res);
        //method 2
        int res1 = countSubsequenc1(s);
        System.out.println(res1);
    }

}
