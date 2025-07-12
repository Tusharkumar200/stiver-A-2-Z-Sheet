import java.util.Stack;

class BSTIterator {
    Stack<TreeNode> st = new Stack<>();
    boolean reverse = true;

    BSTIterator(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode tn = st.pop();
        if (reverse == false) {

            pushAll(tn.right);
        } else {
            pushAll(tn.left);
        }
        return tn.val;
    }

    void pushAll(TreeNode node) {
        while (node != null) {
            st.push(node);
            if (reverse == true) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
    }
}

public class Two_Sum_In_BST {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);

        int i = l.next();
        int j = r.next();

        while (i < j) {

            if (i + j == k)
                return true;
            else if (i + j < k) {
                i = l.next();
            } else {
                j = r.next();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        Two_Sum_In_BST solver = new Two_Sum_In_BST();
        int target = 9;
        System.out.println(solver.findTarget(root, target)); // Output: true

        target = 28;
        System.out.println(solver.findTarget(root, target)); // Output: false
    }
}
