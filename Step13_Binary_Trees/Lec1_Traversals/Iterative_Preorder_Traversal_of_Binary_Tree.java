package Step13_Binary_Trees.Lec1_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Iterative_Preorder_Traversal_of_Binary_Tree {
    
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> preorder = new ArrayList<>();
         Stack<TreeNode> st = new Stack<>();
         if (root == null) {
            return preorder;
        }
        
        st.push(root);

        while (!st.empty()) {
            root = st.pop();
            preorder.add(root.val);

            if(root.right !=null){
                st.push(root.right);
            }
            if(root.left !=null){
                st.push(root.left);
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

        // Initializing the Solution class
        Iterative_Preorder_Traversal_of_Binary_Tree sol = new Iterative_Preorder_Traversal_of_Binary_Tree();

        // Getting the preorder traversal
        List<Integer> result = sol.preorderTraversal(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
