package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q;

    //constructor
    StackUsingQueue() {
        q = new LinkedList<>();
    }

    //pusg operation
    void push(int x){
        q.add(x);

        int size = q.size();
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
        System.out.println(x + " pushed into stack");
    }

    //pop operation
    int pop(){
        if(q.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int removed = q.remove();
        System.out.println(removed + " popped from stack");
        return removed;
    }

    //peek operation
    int peek(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = q.peek();
        System.out.println("Top element is: " + top);
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10); // Push 10
        stack.push(20); // Push 20
        stack.push(30); // Push 30

        stack.peek();   // Top element
        stack.pop();    // Pop 30
        stack.peek();   // Top element 20
        stack.pop();    // Pop 20
        stack.pop();    // Pop 10
        stack.pop();    // Underflow test

    }
}
