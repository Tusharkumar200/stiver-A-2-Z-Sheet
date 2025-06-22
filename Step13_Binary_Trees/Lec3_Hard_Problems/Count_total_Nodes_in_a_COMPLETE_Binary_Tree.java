package Lec3_Hard_Problems;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Count_total_Nodes_in_a_COMPLETE_Binary_Tree {
    
     public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return count(root);
     }

     static int count(TreeNode node){
        if(node == null) return 0;

        if(node.left == null && node.right !=null) return 0;

        int left = count(node.left);
        int right = count(node.right);

        return left + right + 1;
     } 

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Count_total_Nodes_in_a_COMPLETE_Binary_Tree obj = new Count_total_Nodes_in_a_COMPLETE_Binary_Tree();
        int totalNodes = obj.countNodes(root);
        System.out.println(totalNodes);
    }
}
