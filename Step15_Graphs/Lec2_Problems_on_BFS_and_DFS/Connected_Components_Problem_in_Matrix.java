package Lec2_Problems_on_BFS_and_DFS;

class Pair{
    int first;
    int second;

    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}
public class Connected_Components_Problem_in_Matrix {
    
    public static int numIslands(char[][] grid){
        
        int n = grid.length;
        int m = grid[0].length;
        int[][]vis = new int[n][m];
        int cnt =0;

        for(int row=0; row <n; row++){

            for(int col =0 ; col<m; col++){

                if(vis[row][col] == 0 & grid[row][col] =='1'){
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        
    }
}
