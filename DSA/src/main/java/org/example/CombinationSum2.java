package org.example;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
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
    public static List<List<Integer>> CombinationSum5(int candidates[] , int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombination3(0 , target ,candidates ,ans, ds);
        return ans;
    }

    //Function to find all combinations recursively
    public static void findCombination3(int ind ,int target,int arr[] ,List<List<Integer>> ans ,List<Integer> ds){
        //Base Case
        if (target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }


    // Loop through the elements starting from index 'ind'
    for(int i =ind; i < arr.length; i++){
        if ( i > ind && arr[i] == arr[i -1]) continue;

        if(arr[i] > target) break;
        ds.add(arr[i]);
        findCombination3(i + 1, target - arr[i], arr,ans,ds);
        //backtracking
        ds.remove(ds.size() - 1);
    }
}
     public static void main(String[] args){
         int[] v = {10, 1, 2, 7, 6, 1, 5};  // Example input
         int target = 8;  // Target sum

         // Get all combinations that sum up to 8
         List<List<Integer>> comb = CombinationSum5(v, target);

         // Output the combinations
         System.out.print("[ ");
         for (List<Integer> combination1 : comb) {
             System.out.print("[ ");
             for (int num : combination1) {
                 System.out.print(num + " ");
             }
             System.out.print("]");
         }
         System.out.println(" ]");
     }
     }

