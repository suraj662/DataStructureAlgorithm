package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralstoInteger {

    //Example 1:
    //Input: s = "LVIII"
    //Output: 58
    //Explanation: L = 50, V= 5, III = 3.
    //
    //Example 2:
    //Input: s = "MCMXCIV"
    //Output: 1994
    //Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    public static int romanToInt(String s){
        int res = 0;

        Map<Character , Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i=0; i< s.length()-1; i++){
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))){
                res -= roman.get(s.charAt(i));
            }else {
                res += roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(s.length() - 1));
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println("Integer value: " + result);
    }
}
