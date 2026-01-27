package org.example;

//Example 1:
//Input:
// nums = [1, 2, 3]
//Output:
// 4
//Explanation:
// The 6 subarrays of nums are the following:
//[1], range = largest - smallest = 1 - 1 = 0
//[2], range = 2 - 2 = 0
//[3], range = 3 - 3 = 0
//[1,2], range = 2 - 1 = 1
//[2,3], range = 3 - 2 = 1
//[1,2,3], range = 3 - 1 = 2
//So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.
//
//Example 2:
//Input:
// nums = [1, 3, 3]
//Output:
// 4
//Explanation:
// The 6 subarrays of nums are the following:
//[1], range = largest - smallest = 1 - 1 = 0
//[3], range = 3 - 3 = 0
//[3], range = 3 - 3 = 0
//[1,3], range = 3 - 1 = 2
//[3,3], range = 3 - 3 = 0
//[1,3,3], range = 3 - 1 = 2
//So the sum of all ranges is 0 + 0 + 0 + 2 + 0 + 2 = 4.

public class SumofSubarrayRanges {
    //brute force approach
    public static long subArrayRange(int[] arr){
        int n =arr.length;
        long sum =0;
        for(int i=0;i<arr.length-1;i++){
             int smallest = arr[i];
            int largest = arr[i];
            for(int j=i; j<n;j++){
                smallest = Math.min(smallest ,arr[j]);
                largest = Math.max(largest , arr[j]);
                sum += (largest - smallest);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        long ans = subArrayRange(arr);
        System.out.println(ans);
    }
}
