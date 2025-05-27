
package Step13_Binary_Trees.Lec2_Medium_Problems;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    
    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}
public class check_for_balanced_BT{

    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public int dfsHeight(TreeNode root){
        if(root == null)return 0;

        int lh = dfsHeight(root.left);
        if(lh == -1) return -1;
        int rh = dfsHeight(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1)return -1;
        return Math.max(lh,rh) +1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        check_for_balanced_BT checker = new check_for_balanced_BT();
        boolean result = checker.isBalanced(root);
        System.out.println("Is the tree balanced? " + result);
    }
}