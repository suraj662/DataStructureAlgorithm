package org.example;

public class SumofDigits {

    public static void main(String args[]) {
        int num = 123456789;
        int sum = 0;
        //while (num != 0) {
            for(int i=1;i<=num;i++){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
