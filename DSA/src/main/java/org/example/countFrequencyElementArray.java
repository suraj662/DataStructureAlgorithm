package org.example;

public class countFrequencyElementArray {

    public static void countFrequency(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n]; // to mark counted elements

        // Outer loop to pick each element
        for (int i = 0; i < n; i++) {
            // Skip this element if already counted
            if (visited[i]) continue;

            int count = 1; // current element occurs at least once

            // Inner loop to count occurrences of arr[i]
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as visited
                }
            }

            System.out.println(arr[i] + " - " + count + " times");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
        countFrequency(arr);
    }
}
