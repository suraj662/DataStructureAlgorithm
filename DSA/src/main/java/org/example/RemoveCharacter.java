package org.example;

public class RemoveCharacter {

    //Remove a Specified Character from String
    public static String removeChar(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Suraj";
        char ch = 'a';
        System.out.println("After removing '" + ch + "': " + removeChar(str, ch));
    }
}
