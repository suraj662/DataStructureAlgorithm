package org.example;

public class PeakelementinArray {

    //brute force
    public static int peakElement(int nums[]){
        int n = nums.length;

        for(int i=0; i<n; i++){

            boolean left = (i == 0) || (nums[i] >= nums[i - 1]);
            boolean right = (i == n-1) || (nums[i] >= nums[i + 1]);

            if(left & right){
                return i;
            }
        }

        return -1;
    }

    //using binary search
    public static int peakElementBinary(int nums[]){
        int low=0, high = nums.length;

        while(low < high){
            int mid = (low + high)/2;

            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 20,40,50, 4, 1, 0};
        int index = peakElement(nums);
        System.out.println("Peak at index: " + index + " with value: " + nums[index]);

        int index1 = peakElement(nums);
        System.out.println("Peak at index: " + index1 + " with value: " + nums[index1]);
    }
}
