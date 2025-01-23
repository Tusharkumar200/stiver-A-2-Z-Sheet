import java.util.LinkedList;
import java.util.List;

class N_Queen_Problem{
     public static List < List < String >> solveNQueens(int n) {

     }

     static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {

     }

     static List < String > construct(char[][] board) {
        List <String> res = new LinkedList<String>();

        for(int i=0; i<board.length; i++){

            String s = new String(board[i]);
            res.add(s);

        }
        return res;
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