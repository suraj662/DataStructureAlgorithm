package org.example;


import java.util.Stack;

//Input: arr = [1, 3, 2, 4]
//Output: [3, 4, 4, -1]
//Explanation: In the array, the next larger element to 1 is 3, 3 is 4, 2 is 4
// and for 4 is -1, since it does not exist.
//Input : arr = [6, 8, 0, 1, 3]
//Output: [8, -1, 1, 3, -1]
//Explanation : In the array, the next larger element to 6 is 8, for 8 there is no
// larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there
// is no larger element on the right and hence -1.

class Solution_8{
    // Function to find next greater elements
    public int[] nextGreater(int nums[]){
        Stack<Integer> st = new Stack<>();
        // Result array of same size
        int n = nums.length;
        int res[] = new int[n];

        // Traverse from right to left
        for(int i=n-1; i>= 0;i--){
            // Pop all smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            // If stack is empty, no greater element
            if(st.isEmpty()) res[i] = -1;
            //Else top of stack is the answer
            else res[i] = st.peek();

            st.push(nums[i]);
        }
        return res;
    }
}

public class NextGreaterElementUsingStack {
    public static void main(String[] args) {
         Solution_8 st = new Solution_8();
         int nums[] = {4,2,5,6,10,7};
         int ans[] = st.nextGreater(nums);

         for (int x : ans){
             System.out.print(x + " ");
         }
        System.out.println();
    }
}
