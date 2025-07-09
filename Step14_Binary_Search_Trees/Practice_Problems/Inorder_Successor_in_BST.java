
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

class Inorder_Successor_in_BST{

    TreeNode inorderSuccessor(TreeNode root , TreeNode p){
        TreeNode successor = null;

        while(root != null){
            if(p.val >= root.val){

                root = root.right;
            }
            else{
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
    public static void main(String[] args) {
        
    }
}