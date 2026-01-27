package org.example;
import java.util.*;
import java.util.Stack;
//Input:
// nums = "541892", k = 2
//Output:
// "1892"
//Explanation:
// Removing the two digits 5 and 4 yields the smallest number, 1892.
//
//Example 2:
//Input:
// nums = "1002991", k = 3
//Output:
// "21"
//Explanation:
// Remove the three digits 1(leading one), 9, and 9 to form the new number
// 21(Note that the output must not contain leading zeroes) which is the smallest.
public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {

        // Stack to maintain increasing digits
        Stack<Character> stack = new Stack<>();

        // Traverse each digit in the string
        for (char digit : num.toCharArray()) {

            // While:
            // 1. Stack is not empty
            // 2. We still can remove digits
            // 3. Top of stack is greater than current digit
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();   // remove larger digit
                k--;
            }

            // Push current digit into stack
            stack.push(digit);
        }

        // If k > 0, remove remaining digits from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        // If result is empty, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        String nums = "541892";
        int k =3;
        String ans  = removeKdigits(nums ,k);
        System.out.println(ans);
    }

}
