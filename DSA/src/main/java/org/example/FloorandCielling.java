package org.example;

import java.util.*;

public class FloorandCielling {

    public static void findFloorandCiel(int arr[], int x){
        int n = arr.length;
        int low=0, high = n-1;
        int floor=-1, ciel = -1;

        while(low <= high){
            int mid = low +(high - low)/2;

            if(arr[mid] == x){
                floor = arr[mid];
                ciel = arr[mid];
            } else if(arr[mid] < x){
                floor = arr[mid];
                low = mid +1;
            } else{
                ciel = arr[mid];
                high = mid-1;
            }
        }
        System.out.println("Floor: " + floor + ", Ceil: " + ciel);
    }

    public static void main(String args[]){
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        findFloorandCiel(arr, x);
    }
}
