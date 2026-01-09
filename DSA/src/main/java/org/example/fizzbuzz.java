package org.example;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int i=0; i< n ; i++){
                if(i % 15 == 0){
                    System.out.println("Fizzbuzz");
                }
                else if (i % 3 ==0){
                    System.out.println("Fizz");
                }
                else if( i % 5 == 0){
                    System.out.println("buzz");
                }
                else {
                    System.out.println(i);
                }
            }

    }
}
