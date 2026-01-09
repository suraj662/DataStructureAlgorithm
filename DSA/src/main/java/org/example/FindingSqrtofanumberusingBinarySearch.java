package org.example;

public class FindingSqrtofanumberusingBinarySearch {

    //brute force - without using Binary search
    public static int findSqrt(int n){
        int ans = 0;

        for(int i=1; i<n;i++){

            if((float)(i) * i <= n){
                ans =i;
            }else {
                break;
            }
        }
        return ans;
    }

    //for getting perfect sqrt value of Number
    public static double preciseSqrt(int n) {
        int i = 1;
        while (i * i <= n) {
            i++;
        }
        i--; // floor of sqrt

        double ans = i;
        double increment = 0.1;

        // add precision up to 3 decimal places
        for (int j = 0; j < 3; j++) {
            while (ans * ans <= n) {
                ans += increment;
            }
            ans -= increment;
            increment /= 10;
        }
        return ans;
    }

    //using Binary search
    public static int mySqrt(int n){
        if(n < 2) return n;
        int left = 1, right = n/2 , ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if( mid * mid <= n){
                ans = (int)mid;
                left = (int)mid + 1;
            }else{
                right = (int)mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int n = 29;
        int ans =findSqrt(n);
        System.out.println(ans);

        double ans1 = preciseSqrt(n);
        System.out.println(ans1);

        int ans2 =mySqrt(n);
        System.out.println(ans2);

    }
}
