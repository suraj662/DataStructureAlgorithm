package org.example;

class LeftRotate {

    //brute force approach
    static void solve(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 2; i < n; i++) {
            temp[i - 2] = arr[i];
        }
        temp[n - 2] = arr[1];
        temp[ n- 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    //best approach - for only one element left rotating
//    public static void solve(int arr[], int n){
//        int temp = arr[0];
//
//        for(int i=0; i < n-2; i++){
//            arr[i] = arr[i + 2];
//
//        }
//        arr[n - 2] = temp+1;
//        arr[n-1 ]= temp;
//
//        for(int i = 0; i< n ; i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }


    public static void main(String args[]) {
        int n = 5;

        int arr[] = {1, 2, 3, 4, 5};
        solve(arr, n);

    }

}