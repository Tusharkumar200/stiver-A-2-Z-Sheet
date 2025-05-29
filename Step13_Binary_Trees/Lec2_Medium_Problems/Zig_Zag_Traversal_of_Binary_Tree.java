import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Zig_Zag_Traversal_of_Binary_Tree {
    

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
      
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

       
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        
        boolean leftToRight = true;

        
        while (!nodesQueue.isEmpty()) {
            
            int size = nodesQueue.size();

           
            List<Integer> row = new ArrayList<>();

            
            for (int i = 0; i < size; i++) {
                
                TreeNode node = nodesQueue.poll();

                
                int index = leftToRight ? i : (size - 1 - i);

               
                row.add(index, node.val);

                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }

           
            leftToRight = !leftToRight;

          
            result.add(row);
        }

       
        return result;
    }

    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6)));
        Zig_Zag_Traversal_of_Binary_Tree obj = new Zig_Zag_Traversal_of_Binary_Tree();
        List<List<Integer>> result = obj.zigzagLevelOrder(root);
        printResult(result);
    }
}
