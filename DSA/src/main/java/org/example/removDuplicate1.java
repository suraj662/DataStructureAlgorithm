package org.example;

import java.util.Arrays;

public class removDuplicate1 {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            // check if arr[i] already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[index] = arr[i];
                index++;
            }
        }

        // copy only unique part
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 1};

        int[] res = removeDuplicates(arr);

        /*for (int x : res) {
            System.out.print(x + " ");
        }*/

        System.out.println(Arrays.toString(res));
    }

}
