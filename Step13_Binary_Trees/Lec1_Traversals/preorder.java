package Step13_Binary_Trees.Lec1_Traversals;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class preorder {
    
     private void preorderT(TreeNode node, List<Integer> res) {

        if(node == null) return;

        res.add(node.val);
        preorderT(node.left,res);
        preorderT(node.right,res);
     }


    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();

        preorderT(root, res);
        return res;  
    }
    public static void main(String[] args) {
        
    }
}
