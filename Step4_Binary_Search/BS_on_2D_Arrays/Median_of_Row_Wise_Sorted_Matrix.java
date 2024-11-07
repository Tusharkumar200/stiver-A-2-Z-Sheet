package BS_on_2D_Arrays;

import java.util.*;

public class Median_of_Row_Wise_Sorted_Matrix {
    
    //* Linear Search -T.C ->  O(MXN) + O(MXN(log(MXN)))
    public static int Linear_median(int[][] matrix, int m, int n){
        List <Integer> lst = new ArrayList<>();

        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                lst.add(matrix[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get((m * n)/2 );
    }

    //* Binary Search - T.c -> 
    public static int Binary_median(int[][] matrix, int m, int n){

        return -1
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int m = matrix.length, n = matrix[0].length;
        int ans = Linear_median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}
