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
    
     public int findCeil(TreeNode<Integer> root, int key){

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
        
    }
}
