package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SortanArrayof0s1sand2s {

    //Given an array consisting of only 0s, 1s, and 2s.
    // Write a program to in-place sort the array without using
    // inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
    //
    //Examples
    //Input: nums = [2,0,2,1,1,0]
    //Output: [0,0,1,1,2,2]


    public static void sortArray(ArrayList<Integer> arr, int n){
        int low = 0; int mid = 0; int high = n-1;

        while (mid <= high){
            if(arr.get(mid) == 0){

                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low , arr.get(mid));
                arr.set(mid , temp);

                low++;
                mid++;

            } else if(arr.get(mid) == 1){
                mid++;
            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid , arr.get(high));
                arr.set(high , temp);

                high--;
            }
        }
    }

    public static void main(String args[]){
        int n =6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr , n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
