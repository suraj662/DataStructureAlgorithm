package org.example;
import java.util.Stack;

class Solution_3{
    //function to conver t prefic to postfix
    public String PrefictoPostfix(String prefix){
        Stack<String> s = new Stack<>();
        int n = prefix.length();

        //Traverse the prefix expression from right to left
        for(int i=n-1;i>=0;i--){
            char c = prefix.charAt(i);

            // If the character is an operand, push it to the stack
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else {
                // Pop two operands from the stack
                String op1 = s.pop();
                String op2 = s.pop();

                // Form the new postfix expression and push back to stack
                s.push(op1 + op2 + c);
            }
        }
        return s.peek();
    }
}

public class prefixtoPostfixConversion {


    public static void main(String[] args) {
        Solution_3 convert = new Solution_3();
        String prefix = "*-A/BC-/AKL";
        System.out.println(convert.PrefictoPostfix(prefix));
    }
}
