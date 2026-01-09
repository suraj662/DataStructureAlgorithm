package org.example;

import java.util.Arrays;

public class CheckiftwoStringsareanagramsofeachother {

    //brute force

    public static String sortString(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);

        for(int i=0; i< str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //optimised approach
    public static boolean checkAnagramOptimised(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        int freq[] = new int[26];
        for(int i=0; i<str1.length();i++){
            freq[str1.charAt(i) - 'A']++;
        }
        for(int i=0; i<str2.length(); i++){
            freq[str2.charAt(i) - 'A']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNS";
        System.out.println(checkAnagram(Str1, Str2));
        System.out.println(checkAnagramOptimised(Str1, Str2));
    }
}
