

class BSTIterator{
    Stack <TreeNode> st = new Stack<>();
    boolean reverse = true;
    BSTIterator(TreeNode root , boolean isReverse){
        reverse = isReverse;
        pushAll(root);
    }

    
    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode tn = st.pop();
        if( reverse == false){

            pushAll(tn.right);  
        }
        else{
            pushAll(tn.left);
        }
        return tn.val;
    }

    void pushAll(TreeNode node){
        while(node !=null){
            st.push(node);
            if(reverse == true){
                node = node.right;
            }
            else{
                node = node.left;
            }
        }
    }
 }

public class Two_Sum_In_BST {
    

    public static void main(String[] args) {
        
    }
}
