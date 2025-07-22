package Lec_2_Problems_on_BFS_and_DFS;

import java.util.ArrayList;

public class Number_of_provinces {
    
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs , int vis[]){
        
        vis[node] = 1;

        for(Integer it: adjLs.get(node)){
            if(vis[it] == 0){
                dfs(node, adjLs, vis);
            }
        }
    }

     public int findCircleNum(int[][] isConnected) {
        
    }
    public static void main(String[] args) {
        
    }
}
