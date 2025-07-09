
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
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        Inorder_Successor_in_BST obj = new Inorder_Successor_in_BST();
        TreeNode p = root.left.right; // Node with value 12
        TreeNode successor = obj.inorderSuccessor(root, p);

        if (successor != null) {
            System.out.println("Inorder Successor of " + p.val + " is " + successor.val);
        } else {
            System.out.println("Inorder Successor does not exist");
        }
    }
}