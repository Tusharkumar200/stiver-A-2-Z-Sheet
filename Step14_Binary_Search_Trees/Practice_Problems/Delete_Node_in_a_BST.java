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

     TreeNode dummy = root;

     while(root != null){

        if(root.val > key){
            if(root.left !=null && root.left.val == key){
                root.left = helper(root.left);
                break;
            }
            else{
                root = root.left;
            }
        }
        else{
            if(root.right != null && root.right.val == key){
                root.right = helper(root.right);
                break;
            }
            else{
                root = root.right;
            }
        }
     }
     return dummy;
    }

    TreeNode helper(TreeNode root){
         if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        else{
            TreeNode rightChild = root.right;
            TreeNode lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
            return root.left;
        }
    }

    TreeNode findLastRight(TreeNode root){
         if(root.right == null){
            return root;
        }
        return findLastRight(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        Delete_Node_in_a_BST bst = new Delete_Node_in_a_BST();
        root = bst.deleteNode(root, 3);

        // Inorder traversal to print the tree after deletion
        printInorder(root);

        }

        static void printInorder(TreeNode root) {
            if (root == null) return;
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }
}
