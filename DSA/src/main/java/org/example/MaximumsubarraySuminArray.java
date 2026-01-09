package org.example;

public class MaximumsubarraySuminArray {
    //Brute -force approach
//    public static int maxSubarraySum(int arr[], int n){
//        int maxi = Integer.MIN_VALUE;
//
//        for(int i=0; i<n; i++){
//            for(int j=i; j < n; j++){
//                int sum =0;
//                for(int k =i; k <= j; k++){
//                    sum += arr[k];
//                }
//
//                maxi = Math.max(maxi , sum);
//            }
//        }
//
//        return maxi;
//    }


    //kadane approach

    public static long maxSubarraySum(int arr[], int n){
        long maxi = Long.MIN_VALUE;

        long sum = 0;

        for(int i=0; i< n; i++){

            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String args[]){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        //int maxSum = maxSubarraySum(arr, n);
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
