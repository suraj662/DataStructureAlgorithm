package org.example;

public class countOccurenceofElement {

    //brute force
    public static int countOccurence(int arr[], int n , int x){
        int count = 0;
        for(int i=0; i< n; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13, 20,20,20};
        int n = 11, x = 20;
        int ans = countOccurence(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
