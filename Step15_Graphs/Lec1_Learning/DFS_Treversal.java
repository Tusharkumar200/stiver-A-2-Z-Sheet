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
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);

        DFS_Treversal obj = new DFS_Treversal();
        System.out.println(obj.dfsOfGraph(V, adj));
    }
}
