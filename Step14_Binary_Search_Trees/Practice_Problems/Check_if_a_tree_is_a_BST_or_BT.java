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

public class Check_if_a_tree_is_a_BST_or_BT {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, int minVal, int maxVal) {
        if (root == null)
            return true;

        if (root.val >= maxVal || root.val <= minVal)
            return false;

        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }

    public static void main(String[] args) {
        
        Check_if_a_tree_is_a_BST_or_BT checker = new Check_if_a_tree_is_a_BST_or_BT();    }

        // Example 1: Valid BST
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println("Is BST: " + checker.isValidBST(root1)); // true

        // Example 2: Not a BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        System.out.println("Is BST: " + checker.isValidBST(root2)); // false
    
}
