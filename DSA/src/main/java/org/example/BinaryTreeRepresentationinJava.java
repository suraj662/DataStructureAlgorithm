package org.example;
import java.util.*;

class Node_1{
    int data;
    Node_1 left;
    Node_1 right;

    public Node_1(int key){
        data = key;
        left =null;
        right = null;
    }
}
class Solu_1 {
    public Node_1 createBinaryTree(){
        // Creates the root node with key value 1
        Node_1 root = new Node_1(1);

        // Creates a left child node for the root with key value 2
        root.left = new Node_1(2);

        // Creates a right child node for the root with key value 3
        root.right = new Node_1(3);

        // Creates a left child node for the right child of root with key value 5
        root.right.left = new Node_1(5);

        return root;
    }

    //print inorder binary tree
    public void inorder(Node_1 root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //print preorder binary tree
    public void preorder(Node_1 root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //print postorder binary tree
    public void postorder(Node_1 root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    //print tree
    public void printTree(Node_1 root, int space) {
        if (root == null) return;

        space += 5;

        printTree(root.right, space);

        System.out.println();
        for (int i = 5; i < space; i++)
            System.out.print(" ");
        System.out.println(root.data);

        printTree(root.left, space);
    }
}

public class BinaryTreeRepresentationinJava {
    public static void main(String[] args) {
        Solu_1 s = new Solu_1();
        Node_1 root = s.createBinaryTree();
        //System.out.println(root);

        System.out.println("INORDER" +"----------");
        s.inorder(root);
        System.out.println();
        System.out.println("PREORDER " +"------------");
        s.preorder(root);
        System.out.println();
        System.out.println("POSTORDER" + "-------------");
        s.postorder(root);
        System.out.println();
        s.printTree(root ,0);

    }
}
