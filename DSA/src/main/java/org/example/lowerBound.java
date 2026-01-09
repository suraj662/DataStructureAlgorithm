package org.example;

public class lowerBound {

    //brute force- using linear search
    public static int lowerBoundedlinear(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                return i;
            }
        }
        return n;

    }

    //using Binary search
    public static int lowerBoundBinary(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String args[]){
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBoundedlinear(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);

        int index = lowerBoundBinary(arr, n, x);
        System.out.println("The lower bound is the index: " + index);
    }
}
