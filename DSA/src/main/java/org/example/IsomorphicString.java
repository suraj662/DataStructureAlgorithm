package org.example;

public class IsomorphicString {

    //Problem Statement: Given two strings s and t, determine if they
    // are isomorphic. Two strings s and t are isomorphic if the characters
    // in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character
    // while preserving the order of characters. No two characters may map to
    // the same character, but a character may map to itself.

    //Example 1
    //Input: s = "paper", t = "title"
    //Output: true
    //Explanation: The characters in "s" can be mapped one-to-one to characters in "t":
    //'p' → 't', 'a' → 'i', 'e' → 'l', 'r' → 'e'
    //Since the mapping is consistent and unique for each character, the strings are isomorphic.
    //
    //Example 2
    //Input: s = "foo", t = "bar"
    //Output: false
    //Explanation: 'f' → 'b' is fine, 'o' → 'a' for the first 'o', But the second 'o' in "s"
    // would need to map to 'r' in "t", which conflicts with the earlier mapping of 'o' → 'a'
    //This inconsistency makes it impossible to convert "s" to "t" using a one-to-one character
    // mapping.

    public static boolean isomorphString(String s, String t){
        int m1[] = new int[256];
        int m2[] = new int[256];

        int n=s.length();

        for(int i=0;i<n; i++){
            if(m1[s.charAt(i)]  != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }
        return true;
    }

    public static void main(String args[]){
        String s = "paper";
        String t = "title";

        if (isomorphString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
