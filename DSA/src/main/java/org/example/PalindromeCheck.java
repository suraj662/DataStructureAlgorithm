package org.example;

public class PalindromeCheck {
    //Palindrome Check (Without Predefined Methods)

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str + " is palindrome? " + isPalindrome(str));
    }
}
