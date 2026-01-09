package org.example;

import java.util.HashMap;
import java.util.Map;

public class SumofBeautyofallsubstring {
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        String s = "xyx";
        System.out.println("Beauty Sum: " + sol.beautySum(s));
    }
}

class Solution23{
    public int beautySum(String s){
        int n = s.length();
        int sum= 0;

        for(int i=0;i<n;i++){
            Map<Character , Integer> freq = new HashMap<>();
            for(int j=i; j<n; j++){
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j),0)+ 1);
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for(int val : freq.values()){
                    mini = Math.min(maxi , mini);
                    maxi = Math.max(maxi,mini);
                }
                sum += (maxi - mini);
            }
        }
        return sum;
    }
}
