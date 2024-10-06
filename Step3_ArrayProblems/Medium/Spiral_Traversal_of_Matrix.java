

import java.util.ArrayList;
import java.util.List;
public class Spiral_Traversal_of_Matrix {

    public static List<Integer> printSpiral(int[][] mat) {

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        List<Integer> ans = printSpiral(mat);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
