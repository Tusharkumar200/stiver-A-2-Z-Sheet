
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
        
    }
}
