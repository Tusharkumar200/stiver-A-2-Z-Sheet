import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public class Find_K_th_smallest_largest_element_in_BST {
    
     private void inorder(TreeNode node, List<Integer> arr) {
        if(node == null)return;

        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
        return;
     }
    public List<Integer> findKth(TreeNode node, int k) {
        List<Integer> arr = new ArrayList<>();
        inorder(node, arr);
        int kLargest = arr.get(arr.size() - k);
        int kSmallest = arr.get(k -1);
        return Arrays.asList(kSmallest, kLargest);
    }
    public static void main(String[] args) {
        
    }
}
