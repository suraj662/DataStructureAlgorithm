package org.example;

public class RemoveOutermostParentheses {

    public static String removeOutermostParenthesis(String s){
        StringBuilder result = new StringBuilder();
        int level =0;

        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(level > 0){
                    result.append(ch);
                }
                level++;
            }else if(ch == ')'){
                level--;

                if(level > 0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static void main(String args[]){
        String s = "(()())(())";


        String str = removeOutermostParenthesis(s);
        // Print result
        System.out.println("The result is: " + str);
    }
}
