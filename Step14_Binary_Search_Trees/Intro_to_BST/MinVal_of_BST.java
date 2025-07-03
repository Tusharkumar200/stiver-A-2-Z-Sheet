package Step14_Binary_Search_Trees.Intro_to_BST;

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
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        int min = minValue(root);
        System.out.println("Minimum value in BST: " + min);
    }
}
