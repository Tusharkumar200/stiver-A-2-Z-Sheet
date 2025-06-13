
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

public class Check_for_Symmetrical_Binary_Tree {

     private boolean isSymmetricUtil(TreeNode root1, TreeNode root2) {

        if(root1 == null || root2 == null){
            return root1 == root2;
        }

         return (root1.val == root2.val)
                && isSymmetricUtil(root1.left, root2.right)
                && isSymmetricUtil(root1.right, root2.left);

     }
    public boolean isSymmetric(TreeNode root) {

        if(root == null)return true;
        return isSymmetricUtil(root.left, root.right);
    }
    public static void main(String[] args) {
        Check_for_Symmetrical_Binary_Tree treeChecker = new Check_for_Symmetrical_Binary_Tree();

        // Example 1: Symmetric tree
        TreeNode root1 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        System.out.println("Is tree 1 symmetric? " + treeChecker.isSymmetric(root1));

        // Example 2: Not symmetric tree
        TreeNode root2 = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(3)),
            new TreeNode(2, null, new TreeNode(3))
        );
        System.out.println("Is tree 2 symmetric? " + treeChecker.isSymmetric(root2)); }
}
