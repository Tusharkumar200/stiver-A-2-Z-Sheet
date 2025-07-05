
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

public class floor_in_BST {
    
    public static int floorInBST(TreeNode root , int key){

        int floor = -1;

        while(root != null){

            if(root.val == key){
                floor = root.val;
                return floor;
            }

            if(key > root.val){

                floor = root.val;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return floor;
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
        int floor = floorInBST(root, key);
        System.out.println("Floor of " + key + " in BST is: " + floor);
    }
}
