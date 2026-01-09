package org.example;

public class findMissingNumber {
    public static int findMissing(int[] arr) {
        int n = arr.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5};
        System.out.println(findMissing(arr)); // 2
    }
}
