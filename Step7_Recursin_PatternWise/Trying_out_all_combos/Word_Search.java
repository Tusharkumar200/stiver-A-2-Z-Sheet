public class Word_Search {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        int index = 0;

        for(int i=0; i<m;i++){

            for(int j=0; j<n; j++){


               if(board[i][j] == word.charAt(index)){

                   if(searchNext(board, word, i, j, index, m, index)){
                       return true;
                   }
               }     
            }
        }
        
        return false;
    }

    private boolean searchNext(char[][] board, String word, int row, int col, 
    int index, int m, int n) {

        if(index == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row ==m || col == n || board[row][col] != word.charAt(index) || board[row][col] == '!') return false;

        char c = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, row -1, col, index +1, m, n);
        boolean right = searchNext(board, word, row, col+1, index +1, m, n);
        boolean bottom = searchNext(board, word, row +1, col, index +1, m, n);
        boolean left = searchNext(board, word, row , col-1, index +1, m, n);
        
        board[row][col] =c;
            return top || right || bottom || left;
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
