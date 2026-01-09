package org.example;

import java.util.ArrayList;
import java.util.List;

class OptiSolution {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backTrack("" ,0,0,n,res);
        return res;
    }
    public void backTrack(String curr, int open,int close, int n,List<String> res){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }

        if(open < n) backTrack(curr +"(",open+1,close,n,res);
        if(close < open) backTrack(curr + ")",open,close+1,n,res);
    }
}
public class GenerateParanthesisUsingRecursion {
    public static void main(String[] args){
        OptiSolution sol = new OptiSolution();
        List<String> result = sol.generateParenthesis(2);

        for(String s : result){
            System.out.println(s);
        }
    }
}
