package org.example;

class Solution {

    //brute force
    public int findMin(int nums[]) {

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            minVal = Math.min(minVal, nums[i]);
        }
        return minVal;
    }

    public int findMinimum(int nums[]){
        int low = 0, high = nums.length -1;

        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return  nums[low];
    }
}

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {

        // Input array
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        // Create object of Solution
        Solution sol = new Solution();

        // Call function and store result
        int result = sol.findMin(nums);

        // Output the result
        System.out.println("Minimum element is " + result);

        int result1 = sol.findMinimum(nums);
        System.out.println("Minimum element is " + result);

    }
}
