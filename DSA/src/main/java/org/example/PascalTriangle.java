package org.example;

public class PascalTriangle {

    public static long findPascal(int r, int c) {

        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // Compute C(n, k) using iterative formula
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void main(String args[]) {

            //Solution sol = new Solution();
            PascalTriangle pas = new PascalTriangle();
            int r = 5, c = 3;
            System.out.println(pas.findPascal(r, c));
        }
    }

