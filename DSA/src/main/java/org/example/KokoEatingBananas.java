package org.example;

import java.util.Arrays;

public class KokoEatingBananas {

    //Problem Statement: A monkey Koko is given ‘n’ piles of bananas,
    // whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also
    // given, which denotes the time (in hours) for all the bananas to be eaten.

    public static int calculateTotalHours(int a[], int hourly){
        int totalHourly = 0;
        for(int pile : a){
            totalHourly += (int)Math.ceil((double)pile /hourly);
        }
        return totalHourly;
    }

    public static int minEatingSpeed(int a[], int h){
        int maxVal = Arrays.stream(a).max().getAsInt();
        for(int i =1; i<maxVal; i++){
            int hours = calculateTotalHours(a,i);

            if(hours <= h){
                return i;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        // Input array
        int[] a = {3, 6, 7, 11};
        // Hours allowed
        int h = 8;

        int ans = minEatingSpeed(a,h);
        System.out.println(ans);

        BinarySolution obj = new BinarySolution();
        System.out.println(obj.minEatingSpeed(a,h));
    }
}

class BinarySolution{

    private int calculateTotalHours(int piles[], int speed){
        int totalH = 0;
        for (int bananas : piles){
            totalH += (int)Math.ceil((double) bananas /speed);
        }
        return totalH;
    }

    public int minEatingSpeed(int piles[], int h){
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low=0, high = maxPile;
        int ans = maxPile;

        while(low <= high){
            int mid = (low+high)/2;
            int totalH = calculateTotalHours(piles , mid);

            if(totalH <= h){
                ans = mid;
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
