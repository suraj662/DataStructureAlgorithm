package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateallbinaryStrings {

    static void generate(int n, String curr, List<String> result){

        if(curr.length() == n){
            result.add(curr);
            return;
        }

        generate(n , curr + "0",result);

        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
            generate(n, curr + "1", result);
        }
    }

    public static void main(String[] args){
        int n=4;
        List<String> result = new ArrayList<>();

        generate(n, "", result);

        for (String s : result){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
