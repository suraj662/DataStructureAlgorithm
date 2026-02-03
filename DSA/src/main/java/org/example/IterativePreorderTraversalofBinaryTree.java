package org.example;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorderTraversalofBinaryTree {

    public static List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode node = st.pop();
            result.add(node.val);  //root
            // Push right first so left is processed first
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        return result;
    }

    /*
                4
               / \
              2   5
             /     \
            3       7
             \
              9
        */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(9);

        root.right.right = new TreeNode(7);
        List<Integer> preorder = preOrderTraversal(root);

        System.out.println(preorder);

    }
}
