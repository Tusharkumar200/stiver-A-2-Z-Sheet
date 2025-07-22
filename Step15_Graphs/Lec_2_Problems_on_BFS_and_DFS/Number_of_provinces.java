package Lec_2_Problems_on_BFS_and_DFS;

import java.util.ArrayList;

public class Number_of_provinces {
    
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs , int vis[]){
        
        vis[node] = 1;

        for(Integer it: adjLs.get(node)){
            if(vis[it] == 0){
                dfs(it, adjLs, vis);
            }
        }
    }

     public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            if (isConnected[i][j] == 1 && i != j)
                adj.get(i).add(j);

        int[] vis = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
            dfs(i, adj, vis);
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] isConnected = {
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };
        Number_of_provinces obj = new Number_of_provinces();
        System.out.println(obj.findCircleNum(isConnected));
    }
}
