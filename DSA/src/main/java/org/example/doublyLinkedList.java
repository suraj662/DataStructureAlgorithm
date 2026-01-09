package org.example;

class Nodedoubly{
    int data;
    Nodedoubly next;
    Nodedoubly prev;

    Nodedoubly(int data1,Nodedoubly next1,Nodedoubly prev1){
        data = data1;
        next = next1;
        prev = prev1;

    }

    Nodedoubly(int data1){
        data = data1;
        next =null;
        prev = null;
    }
}

public class doublyLinkedList {

    static void printForward(Nodedoubly head) {
        Nodedoubly temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void printBackward(Nodedoubly head) {
        if (head == null) return;

        Nodedoubly temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    //for both direction in one method -
    static void printBothDirections(Nodedoubly head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Nodedoubly temp = head;

        System.out.print("Forward: ");
        while (temp.next != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        // print last node
        System.out.print(temp.data + " -> null");

        System.out.println(); // new line

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {


        int[] arr = {2, 5, 8, 7};
        Nodedoubly head = new Nodedoubly(arr[0]);

        // Printing the memory reference of head
        System.out.println(head);

        // Printing the data stored in head node
        System.out.println(head.data);

        Nodedoubly prev = head;

        for (int i = 1; i < arr.length; i++) {
            Nodedoubly temp = new Nodedoubly(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        // PRINT LIST
        System.out.println("Forward:");
        printForward(head);

        System.out.println("Backward:");
        printBackward(head);

        System.out.println("Both Direction:");
        printBothDirections(head);


    }
    }





