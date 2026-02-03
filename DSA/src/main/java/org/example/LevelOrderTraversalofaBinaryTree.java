package org.example;
import java.util.List;
import java.util.*;
import java.util.Queue;


//TreeNode class
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversalofaBinaryTree {
    public static List<List<Integer>> levelOrder(TreeNode root){
          List<List<Integer>> result = new ArrayList<>();
          if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = levelOrder(root);

        System.out.println(result);

    }
}
