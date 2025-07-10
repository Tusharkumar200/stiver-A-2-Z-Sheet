import java.util.Stack;

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

public class BST_iterator {

    private Stack<TreeNode> st = new Stack<>();

    public BST_iterator(TreeNode root) {
        pushAll(root);
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode tn = st.pop();
        pushAll(tn.right);
        return tn.val;
    }

    void pushAll(TreeNode node) {
        for (; node != null; st.push(node), node = node.left)
            ;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BST_iterator iterator = new BST_iterator(root);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
