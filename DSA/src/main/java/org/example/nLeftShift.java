package org.example;

import java.util.Arrays;

public class nLeftShift {
    //import java.util.Arrays;


        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10, 12};
            int n = 3;  // number of positions to left shift

            System.out.println("Original array: " + Arrays.toString(arr));

            for (int i = 0; i < n; i++) {
                int first = arr[0];
                // Shift elements left by one
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                // Put the first element at the end
                arr[arr.length - 1] = first;
            }

            System.out.println("Array after " + n + " left shifts: " + Arrays.toString(arr));
        }
    }


