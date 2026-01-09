package org.example;

public class upperBound {

    //brute force - linear search
    public static int upperBoundLinear(int arr[], int n , int x){
        for(int i=0;i<n; i++){
            if(arr[i] > x){
                return i;
            }
        }
        return n;
    }

    //using Binary search
    public static int upperBoundBinary(int arr[],int n, int x){
        int low=0, high =n-1;
        int ans =n;
        while(low <= high){
            int mid= (low+high)/2;
            if(arr[mid] > x){
                ans=mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = upperBoundLinear(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);

        int index = upperBoundBinary(arr, x, n);
        System.out.println("The upper bound is the index: " + index);
    }
}
