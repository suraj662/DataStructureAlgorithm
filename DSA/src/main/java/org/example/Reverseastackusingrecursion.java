package org.example;

import java.util.Stack;

public class Reverseastackusingrecursion {

    //Example 1:
    //Input: stack = [4, 1, 3, 2]
    //Output: [2, 3, 1, 4]
    //
    //Example 2:
    //Input: stack = [10, 20, -5, 7, 15]
    //Output: [15, 7, -5, 20, 10]

    public static void insertAtBottom(Stack<Integer> st,int val){
        if (st.isEmpty()){
            st.push(val);
            return;
        }
        int topVal = st.pop();
        insertAtBottom(st,val);
        st.push(topVal);
    }

    public static void reverseStack(Stack<Integer> st){
        if (st.isEmpty()) return;

        int topVal =st.pop();
        reverseStack(st);
        insertAtBottom(st,topVal);
    }

    public static void main(String[] args) {
        // Create a sample stack
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        // Reverse the stack
        reverseStack(st);

        // Print the reversed stack
        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
