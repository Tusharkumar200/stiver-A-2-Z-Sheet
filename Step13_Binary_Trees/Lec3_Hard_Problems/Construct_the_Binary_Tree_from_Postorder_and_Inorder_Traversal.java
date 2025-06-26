import java.util.HashMap;
import java.util.Map;

public class Construct_the_Binary_Tree_from_Postorder_and_Inorder_Traversal {

    Map<Integer, Integer> map = new HashMap<>();
    int idx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        idx = postorder.length - 1;
        return build(postorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int[] inorder, int s, int e) {

        if (s > e)
            return null;
        int curr = postorder[idx--];
        TreeNode root = new TreeNode(curr);
        int id = map.get(curr);
        root.right = build(postorder, inorder, id + 1, e);
        root.left = build(postorder, inorder, s, id - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };
        Construct_the_Binary_Tree_from_Postorder_and_Inorder_Traversal builder = new Construct_the_Binary_Tree_from_Postorder_and_Inorder_Traversal();
        TreeNode root = builder.buildTree(inorder, postorder);

        // Simple inorder traversal to verify the tree
        printInorder(root);
    }

    static void printInorder(TreeNode node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
