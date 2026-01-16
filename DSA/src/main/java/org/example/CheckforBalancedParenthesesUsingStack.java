package org.example;
import java.util.Stack;

//Example 1:
//Input: str = “( )[ { } ( ) ]”
//Output: True
//Explanation: As every open bracket has its corresponding close bracket. Match parentheses are in correct order hence they are balanced.
//
//
//Example 2:
//Input: str = “[ ( )”
//Output: False
//Explanation: As ‘[‘ does not have ‘]’ hence it is not valid and will return false.

class Solution_7 {
    // Function to check if the input string has valid parentheses
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();

                if( (ch == ')' || ch == '(') ||
                        (ch == '{' || ch == '}') ||
                        (ch == '[' || ch == ']')){
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}

public class CheckforBalancedParenthesesUsingStack {

    public static void main(String[] args) {
        Solution_7 sol = new Solution_7();
        String s = "()[{}()]";

        if(sol.isValid(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
