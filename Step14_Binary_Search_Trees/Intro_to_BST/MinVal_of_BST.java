
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

public class MinVal_of_BST {
    
     public static int minValue(TreeNode root) {
        
        if(root == null) return -1;
        while(root.left !=null){
            root = root.left;
        }
        return root.val;
     }
    public static void main(String[] args) {
        
    }
}
