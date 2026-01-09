package org.example;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static int[] mergeSortedArray(int a[], int b[]){
        int n = a.length;
        int m = b.length;

        int result[] = new int[n+m];
        int i=0,j=0,k=0;

        // merge while both arrays have elements
        while(i < n && j < m){
            if(a[i] <= b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = b[j++];
            }
        }

        // copy remaining elements of a[]
        while(i < n){
            result[k++] = a[i++];
        }

        // copy remaining elements of b[]
        while(j < m){
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6};

        int[] merged = mergeSortedArray(a, b);

        System.out.println(Arrays.toString(merged));
    }
}
