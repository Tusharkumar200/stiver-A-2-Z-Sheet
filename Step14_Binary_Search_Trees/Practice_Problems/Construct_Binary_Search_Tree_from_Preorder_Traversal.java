public class Construct_Binary_Search_Tree_from_Preorder_Traversal {
    
     public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    TreeNode bstFromPreorder(int[]A , int bound, int[] i){
        if(i[0] == A.length || A[i[0]] > bound) return null;
        TreeNode root = new TreeNode(A[i[0]++]);
        root.left = bstFromPreorder(A, root.val ,i);
        root.right = bstFromPreorder(A , bound , i);
        return root;
    }
    public static void main(String[] args) {
        Construct_Binary_Search_Tree_from_Preorder_Traversal solution = new Construct_Binary_Search_Tree_from_Preorder_Traversal();
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = solution.bstFromPreorder(preorder);

        // Helper function to print inorder traversal
        printInorder(root);
        }

        // Helper method to print inorder traversal
        static void printInorder(TreeNode node) {
            if (node == null) return;
            printInorder(node.left);
            System.out.print(node.val + " ");
            printInorder(node.right);
        }
    }
}
