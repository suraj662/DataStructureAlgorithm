package org.example;

// Node structure
class Nodes {
    int data;      // store data
    Nodes next;     // pointer to next node

    // Constructor
    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack structure
class Stack {
    Nodes top;   // top of stack
    int size;   // size of stack

    // Constructor
    Stack() {
        top = null;
        size = 0;
    }

    // Push operation
    void push(int data) {
        Nodes newNode = new Nodes(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int removed = top.data;
        top = top.next;
        size--;
        return removed;
    }

    // Peek operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Is Empty operation
    boolean isEmpty() {
        return top == null;
    }

    // Size operation
    int getSize() {
        return size;
    }

    // Print stack
    void printStack() {
        Nodes temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());

        stack.printStack();
        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

