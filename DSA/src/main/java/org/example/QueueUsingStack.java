package org.example;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //enqueue operation
    void enqueue(int x){
        s1.push(x);
        System.out.println(x + " inserted into queue");
    }

    //dequeue operation
    int dequeue() {
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int removed = s2.pop();
        System.out.println(removed + " removed from queue");
        return removed;
    }

    //Peek operation
    int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int front = s2.peek();
        System.out.println("Front element is: " + front );
        return front;
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();
        q.dequeue();
        q.peek();
    }
}
