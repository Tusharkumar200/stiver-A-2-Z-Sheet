package BS_on_2D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_row_with_maximum_number_of_1 {
    
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        
    }
    public static void main(String[] args) {
        <ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " + rowWithMax1s(matrix, n, m));
    }
}
