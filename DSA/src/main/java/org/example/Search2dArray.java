package org.example;

import java.util.ArrayList;
import java.util.*;
public class Search2dArray {

    public  static void search(ArrayList<ArrayList<Integer>> matrix , int target){
        int n = matrix.size();
        int m = matrix.get(0).size();

        boolean found = false;


        for(int i=0; i< n; i++){
            for(int j=0; j < m; j++){
                if(matrix.get(i).get(j) == target)
                    //return true;
                    System.out.println("Target " + target + " found at row: " + i + ", column: " + j);
                    found = true;
            }
        }
        if (!found) {
            System.out.println("Target " + target + " not found in matrix.");
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        search(matrix, 8);

    }
}
