package org.example;

class Node1{
    int data;
    Node next;

    Node1(int data1){
        this.data = data1;
        this.next = null;
    }
}

class Solution123{
    public int linkedListLength(Node head){
        int count =0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class findLinkedlistLength {


    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Solution123 obj = new Solution123();
        System.out.println("length of linkedList :" + obj.linkedListLength(head));

    }

}
