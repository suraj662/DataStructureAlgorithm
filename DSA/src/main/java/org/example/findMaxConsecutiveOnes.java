package org.example;

public class findMaxConsecutiveOnes {
    public static int countConsecutiveOnes(int arr[]){
        int count =0;
        int maxi =0;

        int n = arr.length;

        for(int i=0; i< n; i++){
            if(arr[i] == 1){
                count++;
            } else {
                count =0;
            }
            maxi = Math.max(maxi , count);
        }
        return maxi;
    }

    public static void main(String args[]){
        int arr[] = { 1 , 1 , 1, 1,1,1,11, 0,3 ,3};
        int val = countConsecutiveOnes(arr);
        System.out.println(val);

    }
}
