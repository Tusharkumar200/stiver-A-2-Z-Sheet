package Step15_Graphs;

public class intro_to_graph {
    
    public static void main(String[] args) {
        int n =3, m =2;
        int adj[][] = new int[n+1][n+1];

        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3

        adj[2][3] = 1;
        adj[3][2] = 1;

        // adge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

       

    }
}
