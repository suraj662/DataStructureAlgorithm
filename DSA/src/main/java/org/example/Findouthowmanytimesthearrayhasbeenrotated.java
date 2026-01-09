package org.example;

public class Findouthowmanytimesthearrayhasbeenrotated {

    //brute force
    public static int findKRotation(int arr[]){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int index =-1;
        for(int i=0; i<n; i++){
            if(arr[i] < ans){
                ans = arr[i];
                index =i;
            }
        }
        return index;
    }


    //using binary search
    public static int findKRoatationBinary(int arr[]){
        int low=0, high =arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            //check left parted is sorted
            if(arr[low] < arr[mid]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                //eliminate left half
                low = mid+1;
                }else {  //check right part is sorted
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
         return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0,9,10,0, 1, 2, 3};
        int bruteans = findKRotation(arr);
        System.out.println("The array is rotated " + bruteans + " times.");

        int binaryAnswer = findKRotation(arr);
        System.out.println("The array is rotated " + binaryAnswer + " times.");
    }
}
