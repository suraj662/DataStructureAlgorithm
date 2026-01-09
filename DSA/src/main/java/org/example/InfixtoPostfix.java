package org.example;
import java.util.Stack;


class Solution_1{
    // Function to return precedence of operators
    public static int prece(char c){
        if(c == '^') { //1 priority
            return 3;
        }
        else if(c == '/' || c == '*'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        else {
            return -1;
        }
    }

    // Function to convert infix expression to postfix expression
    public static void infitoPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            // If the scanned character is an operand, add it to the result string
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the scanned character is an ‘(‘, push it to the stack
            else if (c == '(') {
                st.push('(');
            }
            // If the scanned character is a ‘)’, pop from stack until an ‘(‘ is encountered
            else if (c == ')') {
                while (st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();  // Pop the ‘(‘ from the stack
            }
            // If an operator is scanned
            else {
                while (!st.isEmpty() && prece(c) <= prece(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
            // Pop all the remaining elements from the stack
            while(!st.isEmpty()){
                result.append(st.pop());
            }

            System.out.println("Postfix expression: " + result.toString());  // Output the result

    }
}

public class InfixtoPostfix {
    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        Solution_1.infitoPostfix(exp);  // Convert the infix expression to postfix
    }
}
