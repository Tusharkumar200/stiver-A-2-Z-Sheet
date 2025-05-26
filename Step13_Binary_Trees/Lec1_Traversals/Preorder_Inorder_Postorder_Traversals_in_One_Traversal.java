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
    
     public static void printList(List<Integer> list) {
        // Iterate through the list
        // and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting the pre-order, in-order,
        // and post-order traversals
        List<Integer> pre, in, post;
        List<List<Integer>> traversals = preInPostTraversal(root);

        // Extracting the traversals
        // from the result
        pre = traversals.get(0);
        in = traversals.get(1);
        post = traversals.get(2);

        // Printing the traversals
        System.out.print("Preorder traversal: ");
        printList(pre);

        System.out.print("Inorder traversal: ");
        printList(in);

        System.out.print("Postorder traversal: ");
        printList(post);
    }
}
