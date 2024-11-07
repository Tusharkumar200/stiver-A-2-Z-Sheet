package BS_on_2D_Arrays;

public class Median_of_Row_Wise_Sorted_Matrix {
    
    public static int median(int[]matrix, int m, int n){

        return -1;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int m = matrix.length, n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}
