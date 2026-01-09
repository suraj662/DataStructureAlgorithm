package org.example;

// Queue structure
class Queue {
    Node front;   // front of queue
    Node rear;    // rear of queue
    int size;     // number of elements

    // Constructor
    Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(data + " inserted into queue");
    }

    // Dequeue operation
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    // Peek operation
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Is Empty operation
    boolean isEmpty() {
        return front == null;
    }

    // Size operation
    int getSize() {
        return size;
    }

    // Print queue
    void printQueue() {
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ImplementQueueusingLinkedList {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.dequeue());

        q.printQueue();
        System.out.println("Queue size: " + q.getSize());
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
