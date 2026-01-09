package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumCheckUsingRecursion {
    //Example 1:
    //Input :
    // nums = [1, 2, 3, 4, 5] , k = 8
    //Output :
    // Yes
    //Explanation :
    // The subsequences like [1, 2, 5] , [1, 3, 4] , [3, 5] sum up to 8.
    //
    //Example 2:
    //Input :
    // nums = [4, 3, 9, 2] , k = 10
    //Output :
    // No
    //Explanation :
    // No subsequence can sum up to 10.

    public static boolean getSubsequencedistinctSum(int nums[],int index , int sum , int k){
        //base case
        if(k == sum) return true;
        if(index == nums.length) return false;
        if(k < 0 ) return  false;

        if (getSubsequencedistinctSum(nums , index+1,sum + nums[index] ,k)){
            return true;
        }

        return getSubsequencedistinctSum(nums ,index+1 , sum , k);
    }
    public static boolean subsequenceChecker(int nums[], int target){
        int n = nums.length;
        return getSubsequencedistinctSum(nums, 0 ,0 ,target);
    }

    // Method to count subsequences with sum equal to target
    public static int countSubsequenceDP(int nums[],int target){
        int dp[] = new int[target + 1];
        dp[0] = 1;

        for(int num : nums){
            for (int s =target; s >= num;s--){
                dp[s] += dp[s -num];
            }
        }
        return dp[target];
    }

    //This method is used to FIND, PRINT, and
    // COUNT all subsequences whose sum equals a given target.

    public static int findSubsequences(
            int nums[],
            int index,
            int sum ,
            int target ,
            List<Integer> curr) {
        //base case
        if( sum > target) return 0;

        if(index == nums.length){
            if(sum == target){
                System.out.println(curr);
                return 1;
            }
            return 0;
        }

        // include current element
        curr.add(nums[index]);
        int take = findSubsequences(nums , index + 1,sum + nums[index] , target , curr);
        // exclude current element
        int skip = findSubsequences(nums , index +1 ,sum ,target ,curr);

        return take+skip;
    }

    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6,7,8};
        int target = 10;
        System.out.println(subsequenceChecker(arr,target));

        // Method to count subsequences with sum equal to target
        int res = countSubsequenceDP(arr , target);
        System.out.println(res);

        //method to print COUNT all subsequences whose sum equals a given target
        List<Integer> curr = new ArrayList<>();
        int count = findSubsequences(arr ,0,0,target,curr);
        System.out.println("Total subsequences with sum " + target + " = " + count);

    }
}
