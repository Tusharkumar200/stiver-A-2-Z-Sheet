
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}


public class Maximum_path_sum {
    
    int findMaxPathSum(Node root, int[] maxi) {
        // Base case: If the current node is null, return 0
        if (root == null) {
            return 0;
        }

        // Calculate the maximum path sum
        // for the left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left, maxi));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right, maxi));

        // Update the overall maximum
        // path sum including the current node
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.data);

        // Return the maximum sum considering
        // only one branch (either left or right)
        // along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.data;
    }

    // Function to find the maximum
    // path sum for the entire binary tree
    int maxPathSum(Node root) {
        // Initialize maxi to the
        // minimum possible integer value
        int[] maxi = {Integer.MIN_VALUE};

        // Call the recursive function to
        // find the maximum path sum
        findMaxPathSum(root, maxi);

        // Return the final maximum path sum
        return maxi[0];
    }
    
    
    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Maximum_path_sum solver = new Maximum_path_sum();
        int result = solver.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result);
    }
}
