package org.example;

public class commonPrefix {

    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for(int i=0;i<strs.length;i++){
            String curr = strs[i];
            int j =0;

            while(j < prefix.length() && j< curr.length() && prefix.charAt(j) == curr.charAt(j) ){
                j++;
            }

            prefix = prefix.substring(0,j);
            if(prefix.isEmpty()) return  "";

        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(words));
    }
}
