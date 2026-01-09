package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReverseEveryWordinAString {

    //Example 1:
    //Input: s = "welcome to the jungle"
    //Output: "jungle the to welcome"
    //Explanation:
    //The words in the input string are "welcome", "to", "the",
    // and "jungle". Reversing the order of these words gives "jungle",
    // "the", "to", and "welcome". The output string should have exactly
    // one space between each word.
    //
    //Example 2:
    //Input: s = " amazing coding skills "
    //Output: "skills coding amazing"
    //Explanation:
    //The input string has leading and trailing spaces, as well as multiple
    // spaces between the words "amazing", "coding", and "skills". After
    // trimming the leading and trailing spaces and reducing the multiple spaces
    // between words to a single space, the words are "amazing", "coding", and "skills".
    // Reversing the order of these words gives "skills", "coding", and "amazing".
    // The output string should not have any leading or trailing spaces and should have
    // exactly one space between each word.

    public static String reverseWords(String s){
        int n = s.length();
        List<String> words = new ArrayList<>();

        int start ,end;
        int i=0;

        while(i<n){
            while (i<n && s.charAt(i) == ' ') i++;
            if(i >= n) break;;
            start = i;

            while (i<n && s.charAt(i) != ' ') i++;
            end = i-1;

            String wordFound = s.substring(start,end + 1);
            words.add(wordFound);

        }

        StringBuilder ans = new StringBuilder();
        for(int j = words.size() -1; j>= 0;j--){
            ans.append(words.get(j));

            if(j != 0) ans.append(' ');
        }
        return ans.toString();
     }

    public static void main(String[] args) {
        String s = " amazing coding skills ";
        String ans = reverseWords(s);

        // Output
        System.out.println("Input string: " + s);
        System.out.println("After reversing every word: " + ans);
    }
}
