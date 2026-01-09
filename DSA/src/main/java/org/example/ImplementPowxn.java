package org.example;

class powCalculator{
    public double myPow(double x,int n){
        if(n == 0 || x == 1.0) return 1;

        long temp = n;
        if(n < 0 ){
            x = 1/x;
            temp = -1l* n;
        }
        double ans =1;
        for(long i=0;i<temp;i++){
            ans *= x;
        }
        return ans;
    }
}

public class ImplementPowxn {
    //Example 1:
    //Input: x = 2.0000, n = 10
    //Output: 1024.0000
    //Explanation: The answer is calculated as 2^10, which equals 1024.
    //
    //Example 2:
    //Input: x = 2.0000, n = -2
    //Output: 0.2500
    //Explanation: The answer is calculated as 2^(-2), which is equal to 1/4 = 0.25.

    public static void main(String[] args) {
        powCalculator sol = new powCalculator();
        // Output: 1024.0000
        System.out.printf("%.4f\n", sol.myPow(2.0000, 10));
        // Output: 0.2500
        System.out.printf("%.4f\n", sol.myPow(2.0000, -2));
    }
}
