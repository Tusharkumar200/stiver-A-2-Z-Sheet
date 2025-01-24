import java.util.ArrayList;


class Solution {
    private static void solve(int i, int j, int a[][], int n, ArrayList < String > ans, String move,
    int vis[][]) {


    }

    public static ArrayList < String > findPath(int[][] m, int n) {

    }
}


public class Rat_in_a_Maze {
    
   
    public static void main(String[] args) {
         int n = 4;
    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

    Solution obj = new Solution();
    ArrayList < String > res = obj.findPath(a, n);
    if (res.size() > 0) {
      for (int i = 0; i < res.size(); i++)
        System.out.print(res.get(i) + " ");
      System.out.println();
    } else {
      System.out.println(-1);
    }
    }
}
