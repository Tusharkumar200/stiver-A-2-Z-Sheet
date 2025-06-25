import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

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

public class Construct_Binary_Tree_from_inorder_and_preorder {

    public TreeNode buildTree(Vector<Integer> preorder, Vector<Integer> inorder) {

        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.size(); i++) {
            inMap.put(inorder.get(i), i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1, inMap);

        return root;
    }

    private TreeNode buildTree(Vector<Integer> preorder, int preStart, int preEnd, Vector<Integer> inorder, int inStart,
            int inEnd, Map<Integer, Integer> inMap)
             {

                if(preStart > preEnd  ||  inStart > inEnd) return null;
                TreeNode  root   = new  TreeNode(preorder.get(preStart));
                int  inRoot = inMap.get(root.val);
                int numsLeft = inRoot - inStart;

                 root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                inorder, inStart, inRoot - 1, inMap);

        
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                inorder, inRoot + 1, inEnd, inMap);

                return root;
    }

    private void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }


    public static void main(String[] args) {
        Vector<Integer> preorder = new Vector<>();
        Vector<Integer> inorder = new Vector<>();
        preorder.add(3);
        preorder.add(9);
        preorder.add(20);
        preorder.add(15);
        preorder.add(7);
        inorder.add(9);
        inorder.add(3);
        inorder.add(15);
        inorder.add(20);
        inorder.add(7);

        Construct_Binary_Tree_from_inorder_and_preorder obj = new Construct_Binary_Tree_from_inorder_and_preorder();
        TreeNode root = obj.buildTree(preorder, inorder);
        obj.printInorder(root);
    }
}
