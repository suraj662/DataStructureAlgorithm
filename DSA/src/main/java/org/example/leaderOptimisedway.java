package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class leaderOptimisedway {

    //Given an array, print all the elements which are leaders.
    // A Leader is an element that is greater than all of the elements
    // on its right side in the array.

    public static ArrayList<Integer> findLeader(int arr[] , int n){
        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n-1];

        ans.add(arr[n - 1]);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        int n = 6;
        int arr[] = {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans = findLeader(arr, n);

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
