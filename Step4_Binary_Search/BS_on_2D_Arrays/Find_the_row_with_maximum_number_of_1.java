package BS_on_2D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_row_with_maximum_number_of_1 {
    
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // *Linear Approched [ O(n * m)]
        int cnt_max = 0;
        int index = -1;

        for(int i=0; i< n; i++){
            int cnt_once = 0;
            for(int j=0; j<m; j++){
                cnt_once += matrix.get(i).get(j);
            }
            if(cnt_once > cnt_max){
                cnt_max = cnt_once;
                index = i;
            }
        }
        return index;

        // * Binary Approched [ ]
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("Row with the maximum number of 1's: " + rowWithMax1s(matrix, n, m));
    }
}
