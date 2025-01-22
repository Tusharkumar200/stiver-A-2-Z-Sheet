public class Word_Search {

    public boolean exist(char[][] board, String word) {

    }

    private boolean searchNext(char[][] board, String word, int row, int col, 
    int index, int m, int n) {

    }
    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };

        String word = "ABCCED";

        Word_Search sol = new Word_Search();
        boolean res = sol.exist(board, word);
        System.out.println(res);
    }
}
