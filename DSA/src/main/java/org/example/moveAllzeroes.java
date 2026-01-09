package org.example;

import java.util.ArrayList;

public class moveAllzeroes {

    //zero at front
    public static int[] moveZeroes(int n, int []a){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(a[i] == 0){
                temp.add(a[i]);
            }
        }
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }
        for(int i=0; i < n; i++){
            a[i] = temp.get(i);
        }
        return a;
    }

    // zero at end
//    public static int[] moveZeroes(int n, int []a){
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        for(int i=0; i<n; i++){
//            if(a[i] != 0){
//                temp.add(a[i]);
//            }
//        }
//
//        int nz = temp.size();
//
//        for(int i=0; i < nz; i++){
//            a[i] = temp.get(i);
//        }
//
//
//        for(int i= nz; i < n; i++){
//            a[i] = 0;
//        }
//
//        return a;
//
//
//    }


    public static void main(String args[]){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] val = moveZeroes(n , arr);

        for (int i = 0; i < n; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println("");

    }
}
