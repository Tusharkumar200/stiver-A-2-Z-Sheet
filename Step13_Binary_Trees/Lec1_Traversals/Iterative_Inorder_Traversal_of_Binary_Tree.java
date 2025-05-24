package Step13_Binary_Trees.Lec1_Traversals;

import java.util.ArrayList;
import java.util.List;

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

public class Iterative_Inorder_Traversal_of_Binary_Tree {
    
    public static void inorder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static List<Integer> inOrder(Node root) {
        List<Integer> arr = new ArrayList<>();
        
        inorder(root, arr);
       
        return arr;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        
        List<Integer> result = inOrder(root);

        System.out.print("Inorder Traversal: ");
        
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
