package org.example;
import java.util.Stack;

class Solution_6 {
    // Function to return precedence of operators
    public static int getPriority(char C){
        if(C == '^'){
            return 3;
        }
        else if(C == '*' || C == '/'){
            return 2;
        }
        else if(C == '+' || C == '-'){
            return 1;
        }
        return 0;
    }

    //function to cnvert Infix to postfix
    public static String infixToPostfix(String infix) {
        infix = '(' + infix + ')';
        int n =infix.length();
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<n;i++){
            char c = infix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if(c == '('){
                st.push('(');
            }
            else if(c == ')'){
                while (st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && getPriority(c) <= getPriority(st.peek())){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty() ){
            result.append(st.pop());
        }
        return result.toString();
    }

    // Function to convert infix expression to prefix expression
    public static String infixToPrefix(String infix){
        StringBuilder sb = new StringBuilder(infix);

        // Reverse the infix expression
        sb.reverse();

        // Replace '(' with ')' and vice versa
        for(int i=0; i < sb.length();i++){
            if(sb.charAt(i) == '('){
                sb.setCharAt(i , ')');
            }
            else if(sb.charAt(i) == ')'){
                sb.setCharAt(i ,'(');
            }
        }

        // Get the postfix of the modified string
        String prefix = infixToPostfix(sb.toString());

        // Reverse the postfix to get the prefix
        return new StringBuilder(prefix).reverse().toString();
    }
}

public class InfixtoPrefix {
    public static void main(String[] args) {
        String exp = "(p+q)*(c-d)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix Expression: " + Solution_6.infixToPrefix(exp));
    }
}
