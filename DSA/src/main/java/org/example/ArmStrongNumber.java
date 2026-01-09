package org.example;

public class ArmStrongNumber {

    public static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;

        //count
        int digits = 0;
        int temp =n;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        //calculate sum of digits^digits
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit , digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmStrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }
}
