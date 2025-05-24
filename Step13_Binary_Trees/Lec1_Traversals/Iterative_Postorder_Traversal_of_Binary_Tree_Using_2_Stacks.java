package Step13_Binary_Trees.Lec1_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_Postorder_Traversal_of_Binary_Tree_Using_2_Stacks {
    
    
     public static List<Integer> postOrder(Node root) {
        // List to store postorder traversal
        List<Integer> postorder = new ArrayList<>();

        // If the tree is empty, return an empty traversal
        if (root == null) {
            return postorder;
        }

        // Two stacks for iterative traversal
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        // Push the root node onto the first stack
        st1.push(root);

        // Iterative traversal to populate st2 with nodes in postorder
        while (!st1.empty()) {
            // Get the top node from st1
            root = st1.pop();

            // Push the node onto st2
            st2.push(root);

            // Push left child onto st1 if exists
            if (root.left != null) {
                st1.push(root.left);
            }

            // Push right child onto st1 if exists
            if (root.right != null) {
                st1.push(root.right);
            }
        }

        // Populate the postorder traversal list by popping st2
        while (!st2.empty()) {
            postorder.add(st2.pop().data);
        }

        // Return the postorder traversal
        return postorder;
    }

     public static void printList(List<Integer> list) {
       
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting postorder traversal
        List<Integer> result = postOrder(root);

        // Printing the postorder traversal result
        System.out.print("Postorder traversal: ");
        printList(result);
    }
}
