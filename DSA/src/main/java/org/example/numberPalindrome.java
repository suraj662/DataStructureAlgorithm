package org.example;

public class numberPalindrome {
    public static int isNumberPalindrome(int n){
        int original =n;
        int rev =0;

        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }

        return rev;
    }
    public static void main(String[] args){
        int num =121;
        System.out.println(isNumberPalindrome(num));
    }
}
