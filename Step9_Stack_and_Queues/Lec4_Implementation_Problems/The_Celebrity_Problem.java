
// the celebrity problem
public class The_Celebrity_Problem {
    
    private static int findCelebrity(int[][] matrix, int n) {
        int top=0, down = n-1;

        while(top<down){

            if(matrix[top][down] ==1){
                top = top +1;
            }
            else if(matrix[down][top] == 1){
                down = down -1;
            }
            else{
                top--;
                down--;
            }
        }

        if(top > down){
            return -1;
        }
        // top == down;
        for(int i=0; i<n-1; i++){
            if(i == top)continue;
            if(matrix[top][i] == 0 && matrix[i][top] == 1);

            else{
                return -1;
            }
        }
        return top;
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
