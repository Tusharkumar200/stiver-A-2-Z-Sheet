import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

// import Step13_Binary_Trees.Lec1_Traversals.Pair;

// Define a generic Pair class if not available
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class TopView_of_BT {

    public List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            Pair<Node, Integer> pair = q.poll();
            Node node = pair.getKey();
            int line = pair.getValue();

            if (!mpp.containsKey(line)) {
                mpp.put(line, node.data);
            }

            if (node.left != null) {

                q.add(new Pair<>(node.left, line - 1));
            }

            if (node.right != null) {

                q.add(new Pair<>(node.right, line + 1));
            }

            for (int value : mpp.values()) {
                ans.add(value);
            }

            return ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        TopView_of_BT solution = new TopView_of_BT();

        // Get the top view traversal
        List<Integer> topView = solution.topView(root);

        // Print the result
        System.out.println("Vertical Traversal: ");
        for (int node : topView) {
            System.out.print(node + " ");
        }
    }
}
