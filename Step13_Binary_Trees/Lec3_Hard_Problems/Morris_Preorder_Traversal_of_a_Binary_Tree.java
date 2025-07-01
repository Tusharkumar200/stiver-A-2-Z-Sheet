import java.util.List;

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

public class Morris_Preorder_Traversal_of_a_Binary_Tree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        Morris_Preorder_Traversal_of_a_Binary_Tree sol = new Morris_Preorder_Traversal_of_a_Binary_Tree();

        List<Integer> preorder = sol.getPreorder(root);

        System.out.print("Binary Tree Morris Preorder Traveral: ");
        for (int i = 0; i < preorder.size(); i++) {
            System.out.print(preorder.get(i) + " ");
        }
        System.out.println();
    }
}
