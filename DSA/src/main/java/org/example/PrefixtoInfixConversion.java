package org.example;
import java.util.Stack;

class Solution_2{
    // Function to convert prefix to infix
    public String prefixToInfix(String prefix) {
        Stack<String> s = new Stack();
        int n = prefix.length();

        // Traverse the prefix expression from right to left
        for(int i= n-1;i >=0;i--){
            char c = prefix.charAt(i);

            //If the character is an operand, push it to the stack
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else {
                // Pop two operands from the stack
                String op1 = s.pop();
                String op2 = s.pop();

                // Form the new infix expression and push back to stack
                s.push( "(" + op1 + c + op2+ ")");
            }
        }
        return s.peek();
    }
}

public class PrefixtoInfixConversion {
    public static void main(String[] args) {
        Solution_2 converter = new Solution_2();
        String prefix = "*-A/BC-/AKL";
        System.out.println("Infix Expression: " + converter.prefixToInfix(prefix));
    }
}
