package org.example;

class QueueArray {

    int size;        // maximum size of queue
    int front;       // points to first element
    int rear;        // points to last element
    int[] queue;     // array to store queue elements

    // Constructor
    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // ENQUEUE operation (Insert)
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = rear + 1;
        queue[rear] = value;
        System.out.println(value + " inserted into queue");
    }

    // DEQUEUE operation (Delete)
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        int removed = queue[front];
        front = front + 1;
        System.out.println(removed + " removed from queue");
    }

    // FRONT operation (Peek)
    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is: " + queue[front]);
    }

    // MAIN method
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();

        q.dequeue();
        q.peek();
    }
}

