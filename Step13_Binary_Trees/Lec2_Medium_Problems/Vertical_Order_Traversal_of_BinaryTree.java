import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Vertical_Order_Traversal_of_BinaryTree {

   class Pair {
        int[] first;
        TreeNode second;

        Pair(int[] first, TreeNode second) {
            this.first = first;
            this.second = second;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Pair> q = new ArrayDeque<>();  //
        q.offer(new Pair(new int[] {0, 0}, root));

        Map<Integer, List<int[]>> map = new TreeMap<>();

        while (!q.isEmpty()) {
            int n = q.size();
            int dis = q.peek().first[0];
            int level = q.peek().first[1];
            TreeNode TreeNode = q.peek().second;
            q.poll();

            map.computeIfAbsent(dis, k -> new ArrayList<>()).add(new int[] {level, TreeNode.val});

            if (TreeNode.left != null)
                q.offer(new Pair(new int[] {dis - 1, level + 1}, TreeNode.left));
            if (TreeNode.right != null)
                q.offer(new Pair(new int[] {dis + 1, level + 1}, TreeNode.right));
        }

        for (Map.Entry<Integer, List<int[]>> em : map.entrySet()) {

            List<int[]> dummy = em.getValue();
            List<Integer> temp = new ArrayList<>();

            Collections.sort(dummy, (a, b) -> {
                if (a[0] == b[0])
                    return a[1] - b[1];
                return a[0] - b[0];
            });

            for (int[] ele : dummy)
                temp.add(ele[1]);

            ans.add(temp);
        }

        return ans;
    }

    private static void printResult(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int TreeNode : level) {
                System.out.print(TreeNode + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(9);

        Vertical_Order_Traversal_of_BinaryTree solution = new Vertical_Order_Traversal_of_BinaryTree();

        // Get the Vertical traversal
        List<List<Integer>> verticalTraversal = solution.verticalTraversal(root);

        // Print the result
        System.out.print("Vertical Traversal: ");
        printResult(verticalTraversal);
    }
}
