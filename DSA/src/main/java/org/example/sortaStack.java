package org.example;

import java.util.Stack;

public class sortaStack {

    // Function to sort the stack
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insert(stack, temp);
        }
    }

    // Function to insert element in sorted order
    public void insert(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
            
        }

        int val = stack.pop();
        insert(stack, temp);

        stack.push(val);
    }

    public static void main(String[] args) {
        sortaStack sol = new sortaStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sol.sortStack(stack);

        // Print the sorted stack
        System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
