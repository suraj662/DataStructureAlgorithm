package org.example;

public class stringPalindrome {
    public static boolean isStringPlaindrome(String s){
        s = s.toLowerCase();

        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "wooow";
        System.out.println(isStringPlaindrome(str1));
    }
}
