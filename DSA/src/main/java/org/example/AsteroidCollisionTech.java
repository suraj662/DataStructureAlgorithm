package org.example;

import java.util.Arrays;
import java.util.Stack;

//Example 1:
//Input:
// asteroids = [2, -2]
//Output:
// []
//Explanation:
// The asteroid with size 2 and the one with size -2 collide, exploding each other.
//
//Example 2:
//Input:
// asteroids = [10, 20, -10]
//Output:
// [10, 20]
//Explanation:
// The asteroid with size 20 and the one with size -10 collide,
// resulting in the remaining asteroid with size 20. The asteroids with sizes 10 and 20 never collide.

public class AsteroidCollisionTech {

    public static int[] astreroidCollision(int[] asteroids){
        Stack<Integer> st = new Stack<>();


        for(int asteroid : asteroids){
            boolean alive = true;
            while (alive && asteroid > 0 && !st.isEmpty() && st.peek() > 0){
                int top = st.peek();
                int currentSize = Math.abs(asteroid);
                int topSize = top;

                if(currentSize > topSize){
                    st.pop();
                }
                else if(currentSize == topSize){
                    st.pop();
                    alive = false;
                }
                else{
                    alive = false;
                }

            }
            if (alive){
                st.push(asteroid);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length -1; i >= 0; i--){
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1,2,3,-4,-5};
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(astreroidCollision(test1)));

    }
}
