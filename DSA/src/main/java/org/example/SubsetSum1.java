package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum1 {
    //Sum of all Subsets -
    //Input: N = 3, arr[] = {5,2,1}
    //Output: 0,1,2,3,5,6,7,8
    //Explanation: We have to find all the subset’s
    // sum and print them.in this case the generated
    // subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2].
    // [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8
    //
    //Input: N=3,arr[]= {3,1,2}
    //Output: 0,1,2,3,3,4,5,6
    //Explanation: We have to find all the subset’s sum
    // and print them.in this case the generated subsets are
    // [ [], [1], [2], [2,1], [3], [3,1], [3,2]. [3,2,1],so
    // the sums we get will be  0,1,2,3,3,4,5,6

    public static List<Integer> subsetsSum(int arr[]) {
        int n = arr.length;
        List<Integer> sums = new ArrayList<>();

        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }
            sums.add(sum);
        }
        Collections.sort(sums);
        return sums;
    }

    public static void main(String[] args) {
        //Solution sol = new Solution();
        int[] arr = {5, 2, 1};
        List<Integer> result = subsetsSum(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
