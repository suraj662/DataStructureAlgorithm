package org.example;

public class missingNumber {

    //find missing number from continous sequence
    public static int missingNumber(int arr[] , int n){
        int total = (n*(n+1))/2;
        int sum =0;
        for(int i=0; i<n-1; i++){
            sum += arr[i];
        }

        return total-sum;
    }

    //find missing number from non-sequence number
    public static int[] findMissingNumber(int[] original, int[] modified) {
        int missingNumber = -1;
        int missingIndex = -1;

        for (int i = 0, j = 0; i < original.length; i++) {
            if (j < modified.length && original[i] == modified[j]) {
                j++; // element matches, move forward in modified array
            } else {
                missingNumber = original[i];
                missingIndex = i;
                break; // only one missing number assumed
            }
        }

        return new int[]{missingNumber, missingIndex};
    }

    public static void main(String args[]){
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);


        int[] original = {3, 2, 7, 9, 4, 6, 7};
        int[] modified = {3, 2, 7, 4, 6, 7};

        int[] result = findMissingNumber(original, modified);

        System.out.println("Missing number: " + result[0]);
        System.out.println("Original index of missing number: " + result[1]);
    }
}
