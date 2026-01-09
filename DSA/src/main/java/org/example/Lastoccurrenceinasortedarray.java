package org.example;

public class Lastoccurrenceinasortedarray {

    //Given a sorted array of N integers, write a program to
    // find the index of the last occurrence of the target key.
    // If the target is not found then return -1.


    //brute force - using naive solution
    public static int solveLastOccuerencebrute(int n,int key ,int arr[]){
        int result= -1;
        for(int i= n-1; i>= 0; i--){
            if(arr[i] == key){
                result = i;
                break;
            }
        }
        return result;
    }

    //optimised - using binary searching
    public static int searchLastOccurenceBinary(int n, int key, int arr[]){
        int low=0 , high = n-1;
        int result = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                result=mid;
                low = mid+1;

            }else if(key < arr[mid]){
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};

        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(solveLastOccuerencebrute(n, key, v));
        System.out.println(searchLastOccurenceBinary(n, key, v));
    }

}
