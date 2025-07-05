package Step14_Binary_Search_Trees.Practice_Problems;

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


public class Delete_Node_in_a_BST {
    
     public TreeNode deleteNode(TreeNode root, int key) {
     if(root == null){
        return null;
     }   

     if(root.val == key){
        return helper(root);
     }
    }

    TreeNode helper(TreeNode root){

    }

    TreeNode findLastRight(TreeNode root){
        
    }
    public static void main(String[] args) {
        
    }
}
