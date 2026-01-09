package org.example;

class solutiona{
    public boolean searchValue(Node head,int key){
        Node current = head;

        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class searchValLinkedList {
    public static void main(String[] args){
        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        solutiona obj = new solutiona();

        // Search for value
        if (obj.searchValue(head, 40))
            System.out.println("Found");
        else
            System.out.println("Not Found");


    }
}
