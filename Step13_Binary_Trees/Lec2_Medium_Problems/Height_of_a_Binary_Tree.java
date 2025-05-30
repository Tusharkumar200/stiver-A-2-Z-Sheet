
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

public class Height_of_a_Binary_Tree {
    int maxDepth(Node root) {

        if(root == null)return 0;

        int ln = maxDepth(root.left);
        int rn = maxDepth(root.right);

        return 1+ Math.max(ln,rn);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Height_of_a_Binary_Tree tree = new Height_of_a_Binary_Tree();
        int height = tree.maxDepth(root);
        System.out.println("Height of the binary tree: " + height);
    }
}
