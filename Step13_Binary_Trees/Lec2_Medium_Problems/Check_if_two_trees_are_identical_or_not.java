
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
        
        if(p== null || q == null)return (p == q);

        return (p.val == q.val) &&
        isSameTree(p.left, q.left)&&
        isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        Check_if_two_trees_are_identical_or_not checker = new Check_if_two_trees_are_identical_or_not();
        boolean result = checker.isSameTree(tree1, tree2);
        System.out.println("Are the two trees identical? " + result);
    }
}
