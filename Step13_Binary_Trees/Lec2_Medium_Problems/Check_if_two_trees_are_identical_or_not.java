
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

public class Check_if_two_trees_are_identical_or_not {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null)
            return (p == q);

        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Check_if_two_trees_are_identical_or_not checker = new Check_if_two_trees_are_identical_or_not();

        // Tree 1
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // Tree 2 (identical to Tree 1)
        TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // Tree 3 (different structure)
        TreeNode root3 = new TreeNode(1, new TreeNode(2), null);

        System.out.println("Tree 1 and Tree 2 are identical: " + checker.isSameTree(root1, root2)); // true
        System.out.println("Tree 1 and Tree 3 are identical: " + checker.isSameTree(root1, root3)); // false
    }
}
