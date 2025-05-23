package Step13_Binary_Trees.Lec1_Traversals;

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
public class Level_Order_Traversal_of_Binary_Tree {
    
     public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> wraplist = new LinkedList<List<Integer>>();

        if(root == null)return wraplist;
        q.offer(root);

        while (!q.isEmpty()) {
            int levelNum = q.size();
            List<Integer>sublist = new LinkedList<Integer>();
            for(int i=0; i<levelNum;i++){
                if(q.peek().left !=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right !=null){
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().val);
            }
            wraplist.add(sublist);
        }

        return wraplist;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Level_Order_Traversal_of_Binary_Tree lot = new Level_Order_Traversal_of_Binary_Tree();
        List<List<Integer>> result = lot.levelOrder(root);

        System.out.println(result);
    }
}
