import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int first;
    int second;

    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Cycle_Detection_in_undirected_Graph_DFS {

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
            boolean vis[], int parent[]) {
        Queue<Node> q = new LinkedList<>(); // BFS
        q.add(new Node(s, -1));
        vis[s] = true;

        while(!q.isEmpty()){

            int node = q.peek();
            int par = q.peek().second;
            q.remove();

            for(Integer it:adj.get(node)){
                if(vis[it] == false){
                    q.add(new Node(it, node));
                    vis[it] = true;
                }
                else if(par != it) return true;
            }
        }
        return false;

    }

    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[v];
        Arrays.fill(vis, false);
        int parent[] = new int[v];
        Arrays.fill(parent, -1);

        for (int i = 0; i < v; i++) {
            if (vis[i] == false) {
                if (checkForCycle(adj, i, vis, parent))
                    ;
                return true;
            }
        }
    }

    public static void main(String[] args) {

    }
}
