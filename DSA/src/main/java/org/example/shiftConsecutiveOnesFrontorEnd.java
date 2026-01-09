package org.example;

import java.util.Arrays;

public class shiftConsecutiveOnesFrontorEnd {
    public static void moveZerotoEnd(int arr[]){
        int n = arr.length;
        int result[]= new int[n];
        int index=0;
        for(int i=0;i<n ;i++){
            if(arr[i] != 0){
                result[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }

    public static void moveZerotoFront(int arr[]){
        int n = arr.length;
        int result[]= new int[n];
        int index=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] != 0){
                result[index--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
    public static void main(String args[]){
        int arr[] = {0,0,0,0,0,1,1,2,1,1,1,0,0};
        moveZerotoEnd(arr);
        moveZerotoFront(arr);

        //System.out.println(val);
    }
}
