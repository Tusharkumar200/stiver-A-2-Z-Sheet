import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

public class Bottom_View_of_Binary_Tree {
    
     public List<Integer> bottomView(Node root) {
       
        List<Integer> ans = new ArrayList<>();
        
        
        if(root == null) {
            return ans;
        }
       
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

         q.add(new Pair<>(root, 0));

         while(!q.isEmpty()){
             Pair<Node, Integer> pair = q.poll();
            Node node = pair.getKey();
            int line = pair.getValue();

            mpp.put(line, node.data);
            
            // Process left child
            if(node.left != null) {
                // Push the left child with a decreased
                // vertical position into the queue
                q.add(new Pair<>(node.left, line - 1));
            }

              if(node.right != null) {
                // Push the right child with an increased
                // vertical position into the queue
                q.add(new Pair<>(node.right, line + 1));
            }
        }
        
        // Transfer values from the
        // map to the result list
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
         }
    public static void main(String[] args) {
        
    }
}
