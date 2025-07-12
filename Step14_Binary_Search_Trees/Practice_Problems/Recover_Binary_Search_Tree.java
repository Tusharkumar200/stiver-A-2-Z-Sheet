public class Recover_Binary_Search_Tree {
    TreeNode first;
    TreeNode prev;
    TreeNode last;
    TreeNode middle;

    void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null && (root.val < prev.val)) {

            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);

    }

    public void recoverTree(TreeNode root) {
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);

        if (first != null && last != null) {
            int t = first.val;
            first.val = last.val;
            last.val = t;

        } else if (first != null && middle != null) {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;

        }
    }

    public static void main(String[] args) {
        // Example usage: Construct a BST with two nodes swapped
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        System.out.println("Before recovery (inorder):");
        printInorder(root);
        System.out.println();

        Recover_Binary_Search_Tree solver = new Recover_Binary_Search_Tree();
        solver.recoverTree(root);

        System.out.println("After recovery (inorder):");
        printInorder(root);
        System.out.println();
        }

        // Helper method to print inorder traversal
        static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
        }
    }
}
