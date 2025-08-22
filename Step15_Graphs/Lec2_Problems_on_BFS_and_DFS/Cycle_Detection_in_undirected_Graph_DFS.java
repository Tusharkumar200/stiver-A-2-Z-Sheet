import java.util.ArrayList;

public class Cycle_Detection_in_undirected_Graph_DFS {
    
    private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {

        vis[node] = 1;

        for(int adjacentNode: adj.get(node)){
            if(vis[adjacentNode] == 0){
                if(dfs(adjacentNode, parent, vis, adj) == true)
                    return true;

            }
            else if(adjacentNode != parent) return true;
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        int vis[] = new int[V];
        for(int i=0; i<V;i++){
            if(dfs(i, -1, vis, adj) == true) return true; 
        }
        return false;
    }
    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
                
        Cycle_Detection_in_undirected_Graph_DFS obj = new Cycle_Detection_in_undirected_Graph_DFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");    
        else
            System.out.println("0");

    }
}
