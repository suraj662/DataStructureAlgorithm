package org.example;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    //How to think when writing such programs (Mental Template)
    //Whenever you see combinations / subsequences / subsets, ask:
    //What are my choices at each step?
    //Pick / Not pick
    //What changes when I pick?
    //Target decreases
    //Element added
    //What changes when I don’t pick?
    //Move to next index
    //When do I stop recursion?
    //Index reaches end
    //Or target becomes invalid
    //When do I save the answer?
    //When target == 0

    //Example 1:
    //Input: array = [2,3,6,7], target = 7
    //Output: [[2,2,3],[7]]
    //Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    //             7 is a candidate, and 7 = 7.
    //             These are the only two combinations.
    //
    //
    //Example 2:
    //Input: array = [2], target = 1
    //Output: []
    //Explaination: No combination is possible.

    // Main function to get all combinations
    public static List<List<Integer>> CombinationSum2(int candidates[] ,int target){
        List<List<Integer>> ans = new ArrayList<>(); //to stored value
        List<Integer> ds = new ArrayList<>(); // To store a current combination
        findCombination2(0, target, candidates, ans, ds);
        return ans;
    }

    //Function to find all combinations recursively
    public static void findCombination2(int ind,int target,int arr[] ,List<List<Integer>> ans,List<Integer> ds){
        //base case
        if(ind == arr.length){
            // If the target is zero, we have found a valid combination
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // Recursive case: pick the element if it's less than or equal to the target
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombination2(ind ,target -arr[ind] ,arr , ans ,ds);
            ds.remove(ds.size() -1);
        }

        // Skip the current element and move to the next index
       findCombination2(ind + 1, target,arr,ans,ds);
    }

    public static void main(String[] args){
        int v[] = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = CombinationSum2(v,target);

        System.out.println("Combination are:");
        for(List<Integer> combination : ans){
            for(int num : combination){
                System.out.print(num + " ");  // Print each element of the combination
            }
            System.out.println();  // Print a newline after each combination
        }

    }
}
