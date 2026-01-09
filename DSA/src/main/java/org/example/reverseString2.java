package org.example;

import java.util.Stack;

public class reverseString2 {

    //brute force
    public static void main(String args[]){
        String s = "TUF is great for interview preparation";
        System.out.println("After reversing words: ");
        System.out.println(s);
        s += " ";
        Stack<String> st = new Stack<>();
        int i;
        String str = "";

        for(i=0;i<s.length(); i++){
            if(s.charAt(i) == ' '){
                 st.push(str);
                 str = "";
            }else{
                str += s.charAt(i);
            }
        }

        String ans = "";
        while(st.size() != 0){
            ans += st.peek() + " ";
            st.pop();
        }
        //ans += st.peek();
        System.out.println(ans);

        System.out.println("After reversing words: ");
        System.out.print(result(s));
    }

    //optimised approach
    static private String result(String s){
        s += " ";
        int left = 0;
        int right = s.length()-1;

        String temp = "";
        String ans = "";

        //If empty space is encountered then add the current word to the result
        while(left <= right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            }
            else if(ch == ' '){
                if(!ans.equals("")){
                    ans = temp + " " + ans;
                }else{
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        //If not empty string then add to the result(Last word is added)
//        if(!temp .equals("")){
//            if(!ans .equals("")){
//                ans = temp + " " + ans;
//            }else{
//                ans = temp;
//            }
//        }
        return ans;


    }
}
