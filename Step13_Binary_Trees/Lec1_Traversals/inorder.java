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

public class inorder {

     private void inorderT(TreeNode node, List<Integer> res) {

        if(node == null)return;
        inorderT(node.left, res);
        res.add(node.val);
        inorderT(node.right, res);
     }

    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();

        inorderT(root, res);
        return res;  
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        inorder obj = new inorder();
        List<Integer> result = obj.inorderTraversal(root);
        System.out.println(result);
    }
}
