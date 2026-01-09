package org.example;

public class SortByLength {

    //Sort Array of Strings by Length (Ascending and Descending)

    public static void main(String[] args) {
        String[] arr = {"Suraj", "Dev", "Yadav", "Java"};

        // Ascending Order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending by length:");
        for (String s : arr) System.out.println(s);

        // Descending Order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() < arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nDescending by length:");
        for (String s : arr) System.out.println(s);
    }
}
