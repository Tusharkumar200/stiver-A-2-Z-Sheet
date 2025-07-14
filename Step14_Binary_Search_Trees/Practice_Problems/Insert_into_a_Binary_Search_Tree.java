
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


public class Insert_into_a_Binary_Search_Tree {
    
     public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode cur = root;

        while(true){
            if(cur.val <= val){
                if(cur.right != null){
                    cur = cur.right;
                }
                else{
                    cur.right = new TreeNode(val);
                    break;
                }
            }
            else{
                if(cur.left != null){
                    cur = cur.left;
                }
                else{
                    cur.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
     }
    public static void main(String[] args) {
        Insert_into_a_Binary_Search_Tree bst = new Insert_into_a_Binary_Search_Tree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root = bst.insertIntoBST(root, 5);

        // Simple inorder traversal to print the BST
        printInOrder(root);

        }

        public static void printInOrder(TreeNode node) {
            if (node == null) return;
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
}
