import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Boundary_Traversal_of_BT {

    boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    void addLeftBoundary(Node root, List<Integer> res) {
        Node curr = root.left;
        while (curr != null) {

            if (!isLeaf(curr)) {
                res.add(curr.data);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    void addRightBoundary(Node root, List<Integer> res) {
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while (curr != null) {
           
            if (!isLeaf(curr)) {
                temp.add(curr.data);
            }
            // Move to the right child if it exists,
            // otherwise move to the left child
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        // Reverse and add the values from
        // the temporary list to the result
        for (int i = temp.size() - 1; i >= 0; --i) {
            res.add(temp.get(i));
        }
    }

    public static void main(String[] args) {

    }
}