package org.example;


class Node{
    int data;
    Node next;

    //1st contructor using link
    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }

    //2nd constuctor - without using link
    Node(int data){
       this.data = data;
       this.next = null;
    }
}
public class linkedList {

    static Node createUsingFirstConstructor_NoLoop() {
        Node n6 = new Node(6 , null);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node head =  new Node(1,n2);

        return  head;
    }

    static Node createUsingSecondConstructor_NoLoop() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        return head;
    }

    static Node createUsingFirstConstructor_WithLoop(int[] arr) {
        Node head = new Node(arr[arr.length -1],null);

        for(int i = arr.length - 2; i >= 0; i--){
            head = new Node(arr[i], head);
        }
        return  head;
    }

    static  Node createUsingSecondConstructor_WithLoop(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i=1; i< arr.length ; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        printList(createUsingFirstConstructor_NoLoop());
        printList(createUsingFirstConstructor_WithLoop(arr));
        printList(createUsingSecondConstructor_NoLoop());
        printList(createUsingSecondConstructor_WithLoop(arr));
    }



}
