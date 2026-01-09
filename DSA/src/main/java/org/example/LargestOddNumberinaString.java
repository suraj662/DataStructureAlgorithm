package org.example;

public class LargestOddNumberinaString {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String num = "50423456";
        String result = solution.largeOddNum(num);
        System.out.println("Largest odd number: " + result);
    }
}

class Solution1 {
    public String largeOddNum(String s) {
        int ind = -1;

        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        if (ind == -1) return "";

        i = 0;
        while (i <= ind && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, ind + 1);
    }

}
