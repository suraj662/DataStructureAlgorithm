package org.example;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String args[]){

        int[] arr = {2, 4, 2, 6, 4, 8, 8, 10};
        int n = arr.length;

        Arrays.sort(arr);

        int temp[] = new int[n];
        int uniqueCount = 0;

        for(int i=0; i<n; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                temp[uniqueCount++] = arr[i];
            }
        }

        int result[] = new int[uniqueCount];
        for(int i=0; i < uniqueCount; i++){
            result[i] = temp[i];
        }

        System.out.println("Array without duplicates:" + Arrays.toString(result));






    }
}
