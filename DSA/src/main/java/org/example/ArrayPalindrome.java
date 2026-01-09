package org.example;

public class ArrayPalindrome {
    public static boolean isArrayPalindrome(int arr[]){
        int left =0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1,0,0,0,1};
        System.out.println(isArrayPalindrome(arr));
    }
}
