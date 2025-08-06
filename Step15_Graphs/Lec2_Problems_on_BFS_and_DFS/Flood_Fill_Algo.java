package Lec2_Problems_on_BFS_and_DFS;

public class Flood_Fill_Algo {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        int[][] ans= image;

        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};

        dfs(sr,sc,ans,image,newColor, delRow,delCol,initColor);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
