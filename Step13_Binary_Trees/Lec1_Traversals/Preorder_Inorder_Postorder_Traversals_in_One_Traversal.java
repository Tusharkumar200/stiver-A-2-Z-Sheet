import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}


public class Preorder_Inorder_Postorder_Traversals_in_One_Traversal {
    
    public static List<List<Integer>> preInPostTraversal(Node root) {

         Stack<Pair<Node, Integer>> st = new Stack<>();
         st.push(new Pair<>(root, 1));

         List<Integer> pre = new ArrayList<>();
         List<Integer> in = new ArrayList<>();
         List<Integer> post = new ArrayList<>();

         if (root == null) {
            return new ArrayList<>();
        }

        while(!st.isEmpty()){
            Pair<Node, Integer> it = st.pop();

             if (it.getValue() == 1) {
                  pre.add(it.getKey().data);
                   it.setValue(2);
                    st.push(it);

                    if (it.getKey().left != null) {
                    st.push(new Pair<>(it.getKey().left, 1));
                }
             }

              else if (it.getValue() == 2) {
                 in.add(it.getKey().data);
                 it.setValue(3);
                  st.push(it);

                  if (it.getKey().right != null) {
                    st.push(new Pair<>(it.getKey().right, 1));
                }
              }
              else{
                 post.add(it.getKey().data);
              }
        }
         List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }
    
    public static void main(String[] args) {
        
    }
}
