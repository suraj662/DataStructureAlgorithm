package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    //Example 1:
    //Input:
    // k = 3, n = 7
    //Output:
    // [[1, 2, 4]]
    //Explanation:
    //1 + 2 + 4 = 7
    //There are no other valid combinations.
    //Example 2:
    //Input:
    // k = 3, n = 9
    //Output:
    // [[1, 2, 6],[1, 3, 5],[2, 3, 4]]
    //Explanation:
    //1 + 2 + 6 = 9
    //1 + 3 + 5 = 9
    //2 + 3 + 4 = 9
    //There are no other valid combinations.

    public static List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        func1(n,1,nums,k,ans);
        return ans;
    }

    private static void func1(int sum,int last,List<Integer> nums ,int k,List<List<Integer>> ans){
        //base case
        if(sum == 0 && nums.size() == k){
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(sum <= 0 || nums.size() > k) return;

        for(int i =last; i <= 9; i++){
            if (i <= sum){
                nums.add(i);
                func1(sum - i, i+1,nums,k,ans);
                nums.remove(nums.size() - 1);
            }else{
                break;
            }
        }

    }

    public static void main(String[] args) {
        int k = 3; // Number of elements in the combination
        int n = 7; // Target sum
        List<List<Integer>> result = combinationSum3(k, n);

        // Print the result
        for (List<Integer> combination : result) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
