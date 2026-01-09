package org.example;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {

        int arr[] = {9,2,4,6,8};
    boolean sorted = sortedArray(arr);

            if (sorted) {
                System.out.println(" sorted");
            } else {

                System.out.print(" Not sorted");
            }


    }
    public static boolean sortedArray(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;

        }
            return true;
        }



    }




