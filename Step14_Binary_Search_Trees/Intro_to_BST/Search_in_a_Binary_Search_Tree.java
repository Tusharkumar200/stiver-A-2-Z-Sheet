package Step14_Binary_Search_Trees.Intro_to_BST;

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

public class Search_in_a_Binary_Search_Tree {
    
    public TreeNode searchBST(TreeNode root, int val) {

        while(root != null && root.val != val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Search_in_a_Binary_Search_Tree bst = new Search_in_a_Binary_Search_Tree();
        int searchVal = 1;
        TreeNode result = bst.searchBST(root, searchVal);

        if (result != null) {
            System.out.println("Found node with value: " + result.val);
        } else {
            System.out.println("Value not found in BST.");
        }
    }
}
