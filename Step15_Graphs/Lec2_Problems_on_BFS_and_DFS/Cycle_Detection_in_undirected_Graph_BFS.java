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

public class Cycle_Detection_in_undirected_Graph_BFS {

    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
            boolean vis[], int parent[]) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while (!q.isEmpty()) {

            int node = q.peek();
            int par = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (par != it)
                    return true;
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
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Cycle_Detection_in_undirected_Graph_BFS obj = new Cycle_Detection_in_undirected_Graph_BFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
