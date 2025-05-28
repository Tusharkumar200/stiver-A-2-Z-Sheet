
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

class Diameter_of_Binary_Tree{

    int diameter = 0;

    int calculateHeight(Node node) {

        if(node == null)return 0;

        int lh = calculateHeight(node.left);
        int rh = calculateHeight(node.right);

        diameter = Math.max(diameter , lh + rh);
        return 1 +  Math.max(lh , rh);
    }

     int diameterOfBinaryTree(Node root) {

        calculateHeight(root);
        return diameter;
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Diameter_of_Binary_Tree tree = new Diameter_of_Binary_Tree();
        int result = tree.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree is: " + result);
    }
}