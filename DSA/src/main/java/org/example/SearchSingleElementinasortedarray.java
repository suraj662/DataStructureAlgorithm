package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSingleElementinasortedarray {

    //brute force -using XOR operator
    //a ^ a = 0, XOR of two same numbers results in 0.
    //a ^ 0 = a, XOR of a number with 0 always results in that number.
    public static int singleNonDuplicate(ArrayList<Integer> arr){
        int n = arr.size();
        int ans = 0;

        for(int i=0; i<n; i++){
            ans = ans^arr.get(i);
        }
        return ans;
    }

    //using binary search
    public static int singleNonDuplicateBinary(ArrayList<Integer> arr){
        int n = arr.size();

        //error cases
        if(n==1) {
            return arr.get(0);
        }

        if(!arr.get(0).equals(arr.get(1))){
            return arr.get(0);
        }

        if(!arr.get(n-1).equals(arr.get(n-2))) {
            return arr.get(n - 1);
        }


        int low=0, high =n-1;
        while(low <= high){
            int mid = (low+high)/2;

            // If arr[mid] is the single element:
            if(!arr.get(mid).equals(arr.get(mid+1)) &&
                    !arr.get(mid).equals(arr.get(mid-1))) {
                return arr.get(mid);
            }

            // We are in the left:
            if((mid %2 ==1 && arr.get(mid).equals(arr.get(mid -1)))
                || (mid %2 ==0 && arr.get(mid).equals(arr.get(mid +1)))) {

                low = mid+1;

                // We are in the right:
            }
            else {
                high = mid -1;
            }

        }

        return -1;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList
                (1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);

        int answer = singleNonDuplicateBinary(arr);
        System.out.println(answer);
    }
}
