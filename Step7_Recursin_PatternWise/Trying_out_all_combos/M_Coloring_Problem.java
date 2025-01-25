import java.util.ArrayList;
import java.util.List;

public class M_Coloring_Problem {
    
    public static boolean graphColoring(List < Integer > [] G, int[] color, int i, int C) {

    }

    private static boolean isSafe(int node, List < Integer > [] G, int[] color, int n, int col) {

    }

    private static boolean solve(int node, List < Integer > [] G, int[] color, int n, int m) {
        
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        List < Integer > [] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList < > ();
        }
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
        int[] color = new int[N];
        boolean ans = graphColoring(G, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
