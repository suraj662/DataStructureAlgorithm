package org.example;
import java.util.Stack;

class Solution_4{
    //function to convert postfix to prefix
    public String posfixtToPrefix(String postfix) {
        Stack<String> s = new Stack<>();
        int n = postfix.length();

        //Traverse the postfix expression from left to right
        for(int i=0;i<n;i++){
            char c = postfix.charAt(i);

            // If the character is an operand, push it to the start
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                // Pop two operands from the stack
                String op1= s.pop();
                String op2 = s.pop();

                s.push(c + op1 + op2);
            }
        }
        return s.peek();
    }
}

public class PostfixToPrefix {
    public static void main(String[] args) {
        Solution_4 convert = new Solution_4();
        String postfix = "ABC/-AK/L-*";
        System.out.println("Prefix Expersion:" + convert.posfixtToPrefix(postfix));
    }
}
