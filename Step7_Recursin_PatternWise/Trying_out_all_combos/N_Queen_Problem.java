import java.util.List;

class N_Queen_Problem{
     public static List < List < String >> solveNQueens(int n) {

     }

     static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {

     }

     static List < String > construct(char[][] board) {
        
     }
    public static void main(String[] args) {
        int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
        
    }
}