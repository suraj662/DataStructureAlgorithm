package org.example;

import java.util.ArrayList;

public class findSpiraldiralClockwise {
    public static ArrayList<Integer> printSpiral(int arr[][]){
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        int left=0, right =m-1, top=0, bottom = n-1;
        while (top <= bottom && left <= right) {
            //move left to right
            for(int i=left; i<=right; i++){
                ans.add(arr[top][i]);}
            top++;

            //move top to bottom
            for(int i = top; i <= bottom; i++){
                ans.add(arr[i][right]);}
            right--;

            //move right to left
            if(top <= bottom){
                for(int i = right; i >= left; i-- ){
                    ans.add(arr[bottom][i]);}
                bottom--;}


            //move bottom to top
            if(bottom <= top){
                for(int i=bottom; i>= top; i--){
                    ans.add(arr[i][left]);}
                left++;}


        }
        return ans;


    }

    public static void main(String args[]){

        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16,5,6}};

        ArrayList<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
