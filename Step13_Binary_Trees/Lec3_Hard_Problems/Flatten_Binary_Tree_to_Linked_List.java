package Lec3_Hard_Problems;
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
// By using Morris Law's
public class Flatten_Binary_Tree_to_Linked_List {
    
       public void flatten(TreeNode root) {
            TreeNode curr = root;
            while(curr != null){
                if(curr.left !=null){
                    TreeNode pre = curr.left;
                    while (pre.right != null) {
                        pre = pre.right;
                    }
                    pre.right = curr.right;
                    curr.right = curr.left;
                    curr.left = null;
                }
            }
            curr = curr.right;
       }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        Flatten_Binary_Tree_to_Linked_List flattener = new Flatten_Binary_Tree_to_Linked_List();
        flattener.flatten(root);

        // Print the flattened tree
        TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
        System.out.println();
    }
}
