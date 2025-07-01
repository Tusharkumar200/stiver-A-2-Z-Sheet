package Lec3_Hard_Problems;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Morris_Preorder_Traversal_of_a_Binary_Tree {

     public List<Integer> getPreorder(TreeNode root) {
        List <Integer> preorder = new ArrayList<>();
        TreeNode cur = root;

        while(cur != null){
            if(cur.left == null){
                preorder.add(cur.val);
                cur = cur.right;
            }
            else{
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right !=cur) {
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                else{
                    prev.right = null;
                    preorder.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return preorder;
     }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        Morris_Preorder_Traversal_of_a_Binary_Tree sol = new Morris_Preorder_Traversal_of_a_Binary_Tree();

        List<Integer> preorder = sol.getPreorder(root);

        System.out.print("Binary Tree Morris Preorder Traveral: ");
        for (int i = 0; i < preorder.size(); i++) {
            System.out.print(preorder.get(i) + " ");
        }
        System.out.println();
    }
}
