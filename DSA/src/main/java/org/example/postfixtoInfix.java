package org.example;
import java.util.Stack;

class Solution_5 {
    // Function to convert postfix to infix
    public String postfixToInfix(String postfix){
        Stack<String> s = new Stack<>();
        int n = postfix.length();

        // Traverse the postfix expression from left to right
        for(int i=0; i<n;i++){
            char c = postfix.charAt(i);

            // If the character is an operand, push it to the stack
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else {
                String op1 = s.pop();
                String op2 = s.pop();

                s.push("(" + op1 + c + op2 + ")");
            }
        }
        return s.peek();
    }
}

public class postfixtoInfix {
    public static void main(String[] args) {
        Solution_5 convert = new Solution_5();
        String postfix = "AB*C+";
        System.out.println(convert.postfixToInfix(postfix));
    }
}
