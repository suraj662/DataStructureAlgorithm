package org.example;

import java.util.ArrayList;
import java.util.List;

class Solutionz {
    private final String[] map;

    // Constructor to initialize the mapping of digits to characters
    public Solutionz() {
        map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    // Recursive helper function to generate combinations
    private void helper(String digits, List<String> ans, int index, String current) {
        // Base case: if index reaches the end of digits
        if (index == digits.length()) {
            // Add the current combination to the answer
            ans.add(current);
            return;
        }

        // Get characters corresponding to the current digit
        String s = map[digits.charAt(index) - '0'];

        // Loop through the corresponding characters
        for (int i = 0; i < s.length(); i++) {
            // Recursively call function with the next index
            // Add current character to the string
            helper(digits, ans, index + 1, current + s.charAt(i));
        }
    }

    // Function to get all letter combinations for a given digit string
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>(); // List to store results

        // Return empty list if digits string is empty
        if (digits.length() == 0) return ans;

        // Initiate recursive function
        helper(digits, ans, 0, "");
        return ans; // Return the result
    }
}

public record LetterCombinationsofaPhonenumber() {

    //Example 1:
    //Input:
    // digits = "34"
    //Output:
    // [ "dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi" ]
    //Explanation:
    //The 3 is mapped with "def" and 4 is mapped with "ghi".
    //So all possible combinations by replacing the digits with characters are shown in the output.
    //Example 2:
    //Input:
    // digits = "3"
    //Output:
    // [ "d", "e", "f" ]
    //Explanation:
    //The 3 is mapped with "def".

    public static void main(String[] args) {
        Solutionz solution = new Solutionz(); // Create an instance of Solution
        String digits = "23"; // Input digits
        List<String> result = solution.letterCombinations(digits); // Get combinations

        // Print the results
        for (String combination : result) {
            System.out.print(combination + " "); // Display each combination
        }
    }


}
