
// the celebrity problem
public class The_Celebrity_Problem {
    
    private static int findCelebrity(int[][] matrix, int n) {

        return 0;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };

        int n = matrix.length;
        int celebrity = findCelebrity(matrix, n);
        
                if (celebrity == -1) {
                    System.out.println("No celebrity found.");
                } else {
                    System.out.println("Celebrity is person " + celebrity);
                }
            }
        
           
}
