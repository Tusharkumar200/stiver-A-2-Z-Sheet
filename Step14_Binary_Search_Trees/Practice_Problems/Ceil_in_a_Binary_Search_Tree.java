package Step14_Binary_Search_Trees.Practice_Problems;

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

public class Ceil_in_a_Binary_Search_Tree {
    
     public static int findCeil(TreeNode root, int key){

        int ceil = -1;

        while(root != null){

            if(root.val == key){
                ceil = root.val;
                return ceil;
            }

            if(key > root.val){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
     }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        int key = 5;
        int ceil = Ceil_in_a_Binary_Search_Tree.findCeil(root, key);
        System.out.println("Ceil of " + key + " is: " + ceil);
    }
}
