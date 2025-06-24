
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class Minimum_time_taken_to_BURN_the_Binary_Tree_from_a_Node {
    
     static int findDepth(Node root) {
        if (root == null) return 0;
    
        int left = findDepth(root.left);
        int right = findDepth(root.right);
    
        return Math.max(left, right) + 1;
    }

     static int findTarNode(Node root, int target, int[] ans) {
        if(root== null) return -1;

        if(root.data == target){
            int depth = findDepth(root) -1;
            ans[0] = Math.max(ans[0],depth);
            return 1;
        }

         int left = findTarNode(root.left, target, ans);

         if(left != -1){
            int depth = findDepth(root.right);
            ans[0]=Math.max(ans[0], left + depth);
            return left + 1;
         }

         int right = findTarNode(root.right, target, ans);

         if(right != -1){
            int depth = findDepth(root.left);
            ans[0] = Math.max(ans[0], right+depth);
            return right + 1;
         }

         return -1;
     }

     static int minTime(Node root, int target) {
        int[]ans = {0};
        findTarNode(root, target , ans);
        return ans[0];
     }
    public static void main(String[] args) {
        // trees
    }
}
