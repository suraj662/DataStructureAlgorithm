package org.example;

//Example:
//
//Input: N =6, heights[] = {2,1,5,6,2,3}
//Output: 10
//

import java.util.Stack;

public class AreaoflargestrectangleinHistogram {
    //brute force
    public static int largestArea(int[] arr,int n){
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                minHeight = Math.min(minHeight , arr[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea ,area);
            }
        }
        return maxArea;
    }

    //optimal solution
    public static int largestArea1(int[] arr,int n){
        n  = arr.length;
        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();
        //PSE(Previous Smaller Element)
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        //NSE (Next Smalller Element)
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        //find max Area
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width = nse[i] - pse[i] - 1;
            int area = arr[i]* width;
            maxArea = Math.max(maxArea ,area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        int n = arr.length;
        System.out.println(largestArea(arr, n));

        System.out.println("--------------------------");
        System.out.println(largestArea1(arr , n));
    }

}
