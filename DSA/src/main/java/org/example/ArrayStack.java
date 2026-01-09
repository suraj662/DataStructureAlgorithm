package org.example;

   //Example 1:
//Input:
//
//["ArrayStack", "push", "push", "top", "pop", "isEmpty"]
//[[], [5], [10], [], [], []]
//Output:
//  [null, null, null, 10, 10, false]
//Explanation:
//  ArrayStack stack = new ArrayStack();
//- stack.push(5);
//- stack.push(10);
//- stack.top(); // returns 10
//- stack.pop(); // returns 10
//- stack.isEmpty(); // returns false
//Example 2:
//Input: ["ArrayStack", "isEmpty", "push", "pop", "isEmpty"]
//[[], [], [1], [], []]
//Output:
// [null, true, null, 1, true]
//Explanation:
//  ArrayStack stack = new ArrayStack();
//- stack.push(1);
//- stack.pop(); // returns 1
//- stack.isEmpty(); // returns true

import java.util.Arrays;
import java.util.List;

public class ArrayStack {

    int size;        // maximum size of stack
    int top;         // index of top element
    int[] stack;     // array to store stack elements

    // Constructor to create stack
    ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;    // stack is empty initially
    }

    // PUSH operation - for insert element
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }

    // POP operation - for delete top element
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        int removed = stack[top];
        top = top - 1;
        System.out.println(removed + " popped from stack");
    }

    // PEEK operation - to show top element
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    // MAIN method
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();

        s.pop();
        s.peek();
    }


}
