package org.example;

//You want to maximize your profit by choosing a single day to buy one stock and choosing a
// different day in the future to sell that stock. Return the maximum profit
// you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class StockBuyAndSell {
    public static int maxProfit(int arr[]){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;  i < arr.length; i++){
            minPrice = Math.min(minPrice , arr[i]);
            maxPro = Math.max(maxPro , arr[i] - minPrice);
        }

        return maxPro;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }

}
