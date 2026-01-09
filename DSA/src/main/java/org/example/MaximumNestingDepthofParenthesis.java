package org.example;

public class MaximumNestingDepthofParenthesis {

    //Example 1:
    //Input: s = "(1+(2*3)+((8)/4))+1"
    //Output: 3
    //Explanation: Digit 8 is inside of 3 nested parentheses in the string.
    //
    //Example 2:
    //Input: s = "(1)+((2))+(((3)))"
    //Output: 3
    //Explanation: Digit 3 is inside of 3 nested parentheses in the string.

    public static int maxDepth(String s){
        int p = 0;
        int ans = 0;
        for (char ch : s.toCharArray()){
            if(ch == '(') p++;
            else if(ch == ')') p--;

            ans = Math.max(ans ,p);

        }
        return ans;
    }

    public static void main(String[] args) {
        //Solution sol = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}
