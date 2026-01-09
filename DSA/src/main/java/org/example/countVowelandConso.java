package org.example;

public class countVowelandConso {
    public static String countVowelsConsonants(String s){
        int vowels = 0;
        int consonants = 0;

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }

    public static void main(String[] args){
        String str = "Hello World is boring";
        System.out.println(countVowelsConsonants(str));
    }
}
