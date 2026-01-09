package org.example;

public class findNthRootofaNumberusingBinarySearch {

    //brute force
    public static int nthRoot(int n, int m) {
        for (int i = 1; i <= n; i++) {
            long power = (long) Math.pow(i, n);

            if (power == m) return i;
            if (power > m) break;
        }
        return -1;
    }

    //Binary search
    public static int nthRootBinary(int n,int m){
        int low=1, high = m;
        while(low <= high){
            int mid = (low+high)/2;
            long ans = 1;

            for(int i=0;i< n;i++){
                ans *= mid;
                if(ans > m) break;
            }

            if(ans == m) return mid;

            if(ans < m) {
                low = mid+1;
            }else{
                high= mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = nthRoot(n, m);
        System.out.println("Nth Root: " + ans);

        int ans1 = nthRootBinary(n, m);
        System.out.println("Nth Root: " + ans1);

    }
}
