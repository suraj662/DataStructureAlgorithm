package org.example;

public class sumDigitsinArrays {
    public static int sumUntilSingleDigit(int n) {

        while (n > 9) {     // repeat until only one digit remains
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;   // repeat the process
        }

        return n;
    }

    public static void main(String[] args) {
        int num = 9875;

        int result = sumUntilSingleDigit(num);
        System.out.println("Single digit = " + result);
    }


}
