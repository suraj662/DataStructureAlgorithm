package org.example;

public class missingnumberArray {

    public static int findMissing(int a[] , int n ){
        int total = (n*(n + 1)) / 2;

        int sum = 0;

        for(int i=0; i< n-1; i++){
            sum += a[i];
        }

        return total - sum;
    }

    public static void main(String args[]) {
        int n = 5;
        int a[] = {1, 2, 4, 5};

        int ans = findMissing(a,n);
        System.out.println("The missing number is: " + ans);
    }

}
