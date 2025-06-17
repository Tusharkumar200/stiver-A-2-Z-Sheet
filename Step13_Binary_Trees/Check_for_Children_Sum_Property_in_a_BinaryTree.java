package Step13_Binary_Trees;

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


public class Check_for_Children_Sum_Property_in_a_BinaryTree {
    
    public void changeTree(TreeNode root) {

        if(root == null) return;

        int  child  =0;
        if(root.left != null){
            child += root.left.val;
        }

        if(root.right != null){
            child += root.right.val;
        }

        if (child >= root.val) {
            root.val = child;
        } else {
            
            if (root.left != null) {
                root.left.val = root.val;
            } else if (root.right != null) {
                root.right.val = root.val;
            }
        }

        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if (root.left != null) {
            tot += root.left.val;
        }
        if (root.right != null) {
            tot += root.right.val;
        }

         if (root.left != null || root.right != null) {
            root.val = tot;
        }
    }
    public static void main(String[] args) {
        // Example usage:
        // Construct the following tree:
        //        50
        //       /  \
        //     7     2
        //    / \   /
        //   3  5  1

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(7);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(1);

        Check_for_Children_Sum_Property_in_a_BinaryTree obj = new Check_for_Children_Sum_Property_in_a_BinaryTree();
        obj.changeTree(root);

        // Print inorder traversal to verify the change
        printInorder(root);
        }

        // Helper method to print inorder traversal
        public static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
        }
    }
}
