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

public class postorder {
    
     private void postorderT(TreeNode node, List<Integer> res) {
     
        if(node == null)return;

        postorderT(node.left, res);
        postorderT(node.right, res);
         res.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();

        postorderT(root, res);
        return res;  
    }
    public static void main(String[] args) {
        
    }
}
