package org.example;

public class LinearSearch {
public static  void main(String args[])
{
    int arr[] ={1,2,3,6,8,9};
    int num=3;
    int val= search(arr, num);
    System.out.println(val);
}
    public static int search(int[] arr , int num){
        int n = arr.length;


        for(int i = 0; i< n;i++){
            if(arr[i] == num){
                return i;
            }
        }
         return -1;
    }
}
