package org.example;

public class countGoodNumber {
    static final int MOD = 1_000_000_007;

    public static int goodNumber(int index,int n){
        if(index == n){
            return 1;
        }

        int result = 0;
        // Even index
        if(index % 2 == 0){
            int evenDigits[] = {0,2,4,6,8};
            for(int digit : evenDigits){
                result = (result + goodNumber(index+1 , n)) % MOD;
            }
        }
        //odd index
        else{
            int primeDigits[] = {2,3,5,7};
            for(int digit : primeDigits){
                result = (result + goodNumber(index+1 , n)) % MOD;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 1;
        System.out.println(goodNumber(0, n));
    }
}


