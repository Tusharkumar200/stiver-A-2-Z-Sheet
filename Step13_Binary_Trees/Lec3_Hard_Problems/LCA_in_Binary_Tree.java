
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

public class LCA_in_Binary_Tree {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        LCA_in_Binary_Tree lcaFinder = new LCA_in_Binary_Tree();
        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        TreeNode lca = lcaFinder.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
