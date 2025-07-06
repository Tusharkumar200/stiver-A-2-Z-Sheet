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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(k - 1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        Find_K_th_smallest_largest_element_in_BST finder = new Find_K_th_smallest_largest_element_in_BST();
        int k = 3;
        List<Integer> result = finder.findKth(root, k);
        System.out.println("Kth Smallest: " + result.get(0));
        System.out.println("Kth Largest: " + result.get(1));
    }
}
