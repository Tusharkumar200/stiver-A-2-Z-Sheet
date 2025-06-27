
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

public class Serialize_And_Deserialize_BT {
    
    public String serialize(TreeNode root) {
        
         if(root==null) return "null";

        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        q.offer(root);

        while(!q.isEmpty()){

            TreeNode node=q.poll();

            if(node==null){
                sb.append("null,");
                continue;
            }
            sb.append(node.val).append(",");
            q.offer(node.left);
            q.offer(node.right);
        }
        
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       
        if(data.equals("null")) return null;

        String nodes[]=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<nodes.length){

            TreeNode node=q.poll();

            if(!nodes[i].equals("null")){
                node.left=new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(node.left);
            }
            i++;

            if(!nodes[i].equals("null")){
                node.right=new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(node.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Serialize_And_Deserialize_BT codec = new Serialize_And_Deserialize_BT();

        // Create a sample tree: 
        //      1
        //     / \
        //    2   3
        //       / \
        //      4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialized = codec.serialize(root);
        System.out.println("Serialized: " + serialized);

        TreeNode deserialized = codec.deserialize(serialized);
        String reserialized = codec.serialize(deserialized);
        System.out.println("Reserialized: " + reserialized);
    }
}
