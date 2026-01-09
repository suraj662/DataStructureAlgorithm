package org.example;

public class charFrequencies {
    public static void chaFrequency(String s){
        s = s.replace(" ", "").toLowerCase();
        char arr[] = s.toCharArray();
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(visited[i]) continue;

            int count = 1;  // MUST reset count here

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }

    public static void main(String[] args){
        String s1="hello world boring and disgest to see";
        chaFrequency(s1);
    }
}
