package org.example;

public class ImplementAtoi {

    //Problem Statement: Implement the myAtoi(string s) function,
    // which converts a string to a 32-bit signed integer.
    //The algorithm for myAtoi(string s) is as follows:
    //1. Whitespace: Ignore any leading whitespace (" ").
    //2. Signedness: Determine the sign by checking if the next
    // character is '-' or '+', assuming positivity if neither present.
    //3. Conversion: Read the integer by skipping leading zeros until a
    // non-digit character is encountered or the end of the string is reached.
    // If no digits were read, then the result is 0.
    //4. Rounding: If the integer is out of the 32-bit signed integer range
    // [-231, 231 - 1], then round the integer to remain in the range. Specifically,
    // integers less than -231 should be rounded to -231, and integers greater than
    // 231 - 1 should be rounded to 231 - 1.

    //Example 1:
    //Input: s = "1337c0d3"
    //Output: 1337
    //Explanation:
    //Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
    //Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
    //Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character
    // is a non-digit)
    //
    //Example 2:
    //Input: s = "words and 987"
    //Output: 0
    //Explanation: Reading stops at the first non-digit character 'w'.

    public static int myAtoi(String s){
        int i=0 , sign =-1;
        long res = 0;

        while(i < s.length() && s.charAt(i) == ' ') i++;

        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if (s.charAt(i) == '+'){
            i++;
        }

        if(i == s.length()) return 0;

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            res = res * 10 + (s.charAt(i) - '0');

            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * res);
    }

    public static void main(String[] args) {

        String input = "   -42";
        int result = myAtoi(input);
        System.out.println("Converted integer: " + result);
    }
}
