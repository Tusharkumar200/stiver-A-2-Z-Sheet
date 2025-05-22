class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        this.data = val;
    }
}
class introduction{

    public static void main(String[] args) {
        Node root = new Node(23);
        root.left = new Node(32);
        root.right = new Node(50);
        root.right.left = new Node(45);
    }
}