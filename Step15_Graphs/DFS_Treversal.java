import java.util.ArrayList;

public class DFS_Treversal {


     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V + 1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(V, vis, adj, ls);
        return ls;
     }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> ls) {
                vis[node] = true;
                ls.add(node);

                for(Integer it : adj.get(node)){
                    if(vis[it] == false){
                        dfs(node, vis, adj, ls);
                    }
                }
    }

    public static void main(String[] args) {

    }
}
