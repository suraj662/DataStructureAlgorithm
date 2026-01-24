package org.example;

//Example 1:
//Input:
//arr = [3, 1, 2, 5]
//Output:
//        18
//Explanation:
//The minimum of subarrays: [3], [1], [2], [5], [3, 1], [1, 2],
// [2, 5], [3, 1, 2], [1, 2, 5], [3, 1, 2, 5] are
// 3, 1, 2, 5, 1, 1, 2, 1, 1, 1 respectively and their sum is 18.
//
//Example 2:
//Input:
//arr = [2, 3, 1]
//Output:
//        10
//Explanation:
//The minimum of subarrays: [2], [3], [1], [2,3], [3,1], [2,3,1] are
// 2, 3, 1, 2, 1, 1 respectively and their sum is 10.

import java.util.Stack;

public class SumofSubarrayMinimums {

    //brute
    public static int sumSubarrayMins(int[] arr){
        int n = arr.length;
        // Modulo value to prevent integer overflow
        int mod = (int)1e9 + 7;
        int sum = 0;

        // For each starting position
        for (int i =0;i<n;i++){
            int mini = arr[i];

            for(int j=i;j<n; j++){
                mini = Math.min(mini , arr[j]);
                sum = (sum + mini)% mod;
            }
        }
        return sum;
    }

    //optimal
    public static int sumSubarrMinStack(int[] arr){
        int n = arr.length;
        int mod = (int)1e9 + 7;
        long sum  = 0;
        Stack<Integer> st = new Stack<>();

        // Process each element + one extra iteration
        for(int i =0;i<= n ; i++){
            int currVal  = (i == n) ? 0 : arr[i];
            // Pop elements that are >= current value
            while (!st.isEmpty() &&  arr[st.peek()] >= currVal ){
                int idx = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                // Calculate contribution
                long leftCount = idx - left;
                long rightCount = right - idx;
                long contribution = (leftCount * rightCount % mod) * arr[idx] % mod;

                sum = (sum + contribution) % mod;
            }
            st.push(i);
        }
        return (int)sum;
    }

    //using 2 spaces with array
    public static int sumSubarrayMiniUsingSpaces(int[] arr){
        int n = arr.length;
        int mod = 1_000_000_007;
        long sum = 0;

        // Use array as stack (faster than Stack object)
        int[] stack = new int[n+1];
        int top = -1;

        for(int i=0;i<=n;i++){
            int currVal  = (i == n)? 0 : arr[i];
            while (top >= 0 && (top < 0 || arr[stack[top]] >= currVal )){
                    int idx = stack[top--];
                    int left = (top >= 0) ? stack[top] : -1;

                    long leftCount = idx -left ;
                    long rightCount = i - idx ;
                    long contribution = leftCount * rightCount % mod * arr[idx] % mod;
                    sum = (sum + contribution) % mod;
            }
            stack[++top] = i;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5};
        int ans = sumSubarrayMins(arr);
        System.out.println(ans);

        System.out.println("--------------------------------------");

        int ans1 = sumSubarrMinStack(arr);
        System.out.println(ans1);
        System.out.println("----------------------------------------");
        int ans2 = sumSubarrayMiniUsingSpaces(arr);
        System.out.println(ans2);
    }
}
