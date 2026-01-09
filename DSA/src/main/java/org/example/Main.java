package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          //int n = arr.length;


          while(t --> 0) {
              int n = sc.nextInt();
              int arr[] = new int[n];

              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }


              int max = arr[0];
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i] > max) {
                      max = arr[i];
                  }
              }
              //System.out.println((max));


              System.out.println((max));

          }
    }
}