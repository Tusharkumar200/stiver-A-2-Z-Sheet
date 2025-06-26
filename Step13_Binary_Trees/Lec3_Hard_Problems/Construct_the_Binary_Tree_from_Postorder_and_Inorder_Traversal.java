import java.util.HashMap;
import java.util.Map;

public class Construct_the_Binary_Tree_from_Postorder_and_Inorder_Traversal {
    
     Map<Integer, Integer> map = new HashMap<>();
    int idx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        idx = postorder.length - 1;
        return build(postorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int[] inorder, int s, int e) {
        
    }
    public static void main(String[] args) {
        
    }
}
