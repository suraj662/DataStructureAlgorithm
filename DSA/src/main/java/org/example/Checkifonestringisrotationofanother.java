package org.example;

public class Checkifonestringisrotationofanother {

    //Example 1:
    //Input: s = "rotation", goal = "tionrota"
    //Output: true
    //Explanation: After multiple left shifts on "rotation", we get:
    //    1st shift → "otationr"
    //    2nd shift → "tationro"
    //    3rd shift → "ationrot"
    //    4th shift → "tionrota"
    //    So the goal string can be obtained by rotating the original string.
    //
    //Example 2:
    //Input: s = "hello", goal = "lohelx"
    //Output: false
    //Explanation:
    //Even after all possible rotations of "hello", we cannot form "lohelx"
    // due to the presence of an extra character 'x'. Hence, it's not possible.


    //brute force approach
    public static boolean rotateString(String s,String goal){
        if(s.length() != goal.length()) return false;

        for(int i=0; i<s.length(); i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }

    //brute force
    public static boolean rotateStringbrute(String s,String goal){
        if(s.length() != goal.length()){
            return false;
        }

        String doubledS =s + s;

        return doubledS.contains(goal);
    }

    public static void main(String[] args) {


        String s1 = "rotation";
        String goal1 = "tionrota";
        System.out.println(rotateString(s1, goal1));
        System.out.println(rotateStringbrute(s1, goal1));
    }
}
