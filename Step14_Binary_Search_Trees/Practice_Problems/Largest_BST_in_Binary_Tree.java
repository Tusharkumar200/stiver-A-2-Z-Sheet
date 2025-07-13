public class Largest_BST_in_Binary_Tree {
    
      int maxSum = 0; 
    class NodePair{ 
        int min, max, sum;
    }
    public NodePair getSum(TreeNode root){
        if(root == null){  
            NodePair a = new NodePair();
            a.min = Integer.MAX_VALUE;
            a.max = Integer.MIN_VALUE;
            a.sum = 0;
            return a;
        }
        NodePair main = new NodePair();
        NodePair left = getSum(root.left);  
        NodePair right = getSum(root.right);  
        
        if(left.max < root.val && root.val < right.min){  //validating the bst
            main.min = Math.min(root.val, Math.min(left.min, right.min));
            main.max = Math.max(root.val, Math.max(left.max, right.max));
            main.sum = root.val + left.sum + right.sum;
            maxSum = Math.max(maxSum,main.sum);
        }
        else{
            main.min = Integer.MIN_VALUE;  // if not bst then just pass the sum calculated as of now
            main.max = Integer.MAX_VALUE;
            main.sum = Math.max(left.sum,right.sum);
        }
        return main;
    }
    public int maxSumBST(TreeNode root) {
        return maxSum > 0 ? maxSum : 0;
    }

    public static void main(String[] args){
        Largest_BST_in_Binary_Tree solution = new Largest_BST_in_Binary_Tree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        int result = solution.maxSumBST(root);
        System.out.println("Maximum sum BST in Binary Tree: " + result);
    }
}
